package compose.icons.phosphoricons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.DuotoneGroup

public val DuotoneGroup.MicrosoftPowerpointLogo: ImageVector
    get() {
        if (_microsoftPowerpointLogo != null) {
            return _microsoftPowerpointLogo!!
        }
        _microsoftPowerpointLogo = Builder(name = "MicrosoftPowerpointLogo", defaultWidth =
                256.0.dp, defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight =
                256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(152.0f, 80.0f)
                verticalLineToRelative(96.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, 8.0f)
                horizontalLineTo(40.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, -8.0f)
                verticalLineTo(80.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.0f, -8.0f)
                horizontalLineTo(144.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 152.0f, 80.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(94.0f, 96.0f)
                lineTo(78.0f, 96.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, 8.0f)
                verticalLineToRelative(48.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f)
                verticalLineToRelative(-8.0f)
                horizontalLineToRelative(8.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, false, 0.0f, -48.0f)
                close()
                moveTo(94.0f, 128.0f)
                lineTo(86.0f, 128.0f)
                lineTo(86.0f, 112.0f)
                horizontalLineToRelative(8.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 16.0f)
                close()
                moveTo(136.0f, 24.0f)
                arcTo(104.5f, 104.5f, 0.0f, false, false, 54.0f, 64.0f)
                lineTo(40.0f, 64.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 24.0f, 80.0f)
                verticalLineToRelative(96.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f)
                lineTo(54.0f, 192.0f)
                arcTo(104.0f, 104.0f, 0.0f, true, false, 136.0f, 24.0f)
                close()
                moveTo(223.6f, 120.0f)
                lineTo(160.0f, 120.0f)
                lineTo(160.0f, 80.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -16.0f, -16.0f)
                lineTo(144.0f, 40.4f)
                arcTo(88.0f, 88.0f, 0.0f, false, true, 223.6f, 120.0f)
                close()
                moveTo(128.0f, 40.4f)
                lineTo(128.0f, 64.0f)
                lineTo(75.6f, 64.0f)
                arcTo(88.7f, 88.7f, 0.0f, false, true, 128.0f, 40.4f)
                close()
                moveTo(40.0f, 80.0f)
                lineTo(144.0f, 80.0f)
                verticalLineToRelative(47.9f)
                horizontalLineToRelative(0.0f)
                lineTo(144.0f, 176.0f)
                lineTo(40.0f, 176.0f)
                close()
                moveTo(128.0f, 192.0f)
                verticalLineToRelative(23.6f)
                arcTo(88.7f, 88.7f, 0.0f, false, true, 75.6f, 192.0f)
                close()
                moveTo(144.0f, 215.6f)
                lineTo(144.0f, 192.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f)
                lineTo(160.0f, 136.0f)
                horizontalLineToRelative(63.6f)
                arcTo(88.0f, 88.0f, 0.0f, false, true, 144.0f, 215.6f)
                close()
            }
        }
        .build()
        return _microsoftPowerpointLogo!!
    }

private var _microsoftPowerpointLogo: ImageVector? = null
