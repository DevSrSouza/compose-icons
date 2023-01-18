package compose.icons.ionicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.IonIcons

public val IonIcons.VideocamOutline: ImageVector
    get() {
        if (_videocamOutline != null) {
            return _videocamOutline!!
        }
        _videocamOutline = Builder(name = "VideocamOutline", defaultWidth = 512.0.dp, defaultHeight
                = 512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(374.79f, 308.78f)
                lineTo(457.5f, 367.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 480.0f, 352.38f)
                verticalLineTo(159.62f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 457.5f, 145.0f)
                lineToRelative(-82.71f, 58.22f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 368.0f, 216.3f)
                verticalLineToRelative(79.4f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 374.79f, 308.78f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(268.0f, 384.0f)
                horizontalLineTo(84.0f)
                arcToRelative(52.15f, 52.15f, 0.0f, false, true, -52.0f, -52.0f)
                verticalLineTo(180.0f)
                arcToRelative(52.15f, 52.15f, 0.0f, false, true, 52.0f, -52.0f)
                horizontalLineTo(268.48f)
                arcTo(51.68f, 51.68f, 0.0f, false, true, 320.0f, 179.52f)
                verticalLineTo(332.0f)
                arcTo(52.15f, 52.15f, 0.0f, false, true, 268.0f, 384.0f)
                close()
            }
        }
        .build()
        return _videocamOutline!!
    }

private var _videocamOutline: ImageVector? = null
