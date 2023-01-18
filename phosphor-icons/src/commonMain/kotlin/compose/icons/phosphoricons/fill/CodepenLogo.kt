package compose.icons.phosphoricons.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.FillGroup

public val FillGroup.CodepenLogo: ImageVector
    get() {
        if (_codepenLogo != null) {
            return _codepenLogo!!
        }
        _codepenLogo = Builder(name = "CodepenLogo", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(240.0f, 101.0f)
                verticalLineToRelative(64.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -4.1f, 7.0f)
                lineTo(142.0f, 225.3f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -6.0f, -3.5f)
                verticalLineTo(164.7f)
                lineTo(191.8f, 133.0f)
                lineTo(224.0f, 151.3f)
                verticalLineTo(114.7f)
                lineTo(191.8f, 133.0f)
                lineToRelative(-16.2f, -9.2f)
                lineTo(215.8f, 101.0f)
                lineTo(136.0f, 55.7f)
                verticalLineToRelative(45.6f)
                lineToRelative(39.6f, 22.5f)
                lineToRelative(-47.6f, 27.0f)
                lineToRelative(-47.6f, -27.0f)
                lineTo(120.0f, 101.3f)
                verticalLineTo(55.7f)
                lineTo(40.2f, 101.0f)
                lineToRelative(40.2f, 22.8f)
                lineTo(64.2f, 133.0f)
                lineTo(32.0f, 114.7f)
                verticalLineToRelative(36.6f)
                lineTo(64.2f, 133.0f)
                lineTo(120.0f, 164.7f)
                verticalLineToRelative(57.1f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -6.0f, 3.5f)
                lineTo(20.1f, 172.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -4.1f, -7.0f)
                verticalLineTo(101.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 4.1f, -7.0f)
                lineToRelative(100.0f, -56.7f)
                arcToRelative(15.9f, 15.9f, 0.0f, false, true, 15.8f, 0.0f)
                lineTo(235.9f, 94.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 240.0f, 101.0f)
                close()
            }
        }
        .build()
        return _codepenLogo!!
    }

private var _codepenLogo: ImageVector? = null
