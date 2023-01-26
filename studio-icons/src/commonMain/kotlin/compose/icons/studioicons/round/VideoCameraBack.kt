package compose.icons.studioicons.round

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.RoundGroup

public val RoundGroup.VideoCameraBack: ImageVector
    get() {
        if (_videoCameraBack != null) {
            return _videoCameraBack!!
        }
        _videoCameraBack = Builder(name = "VideoCameraBack", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.0f, 10.48f)
                verticalLineTo(6.0f)
                curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f)
                horizontalLineTo(4.0f)
                curveTo(2.9f, 4.0f, 2.0f, 4.9f, 2.0f, 6.0f)
                verticalLineToRelative(12.0f)
                curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f)
                horizontalLineToRelative(12.0f)
                curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f)
                verticalLineToRelative(-4.48f)
                lineToRelative(3.15f, 3.13f)
                curveTo(21.46f, 16.97f, 22.0f, 16.74f, 22.0f, 16.3f)
                verticalLineTo(7.7f)
                curveToRelative(0.0f, -0.44f, -0.54f, -0.67f, -0.85f, -0.35f)
                lineTo(18.0f, 10.48f)
                close()
                moveTo(5.6f, 15.2f)
                lineToRelative(1.38f, -1.83f)
                curveToRelative(0.2f, -0.27f, 0.6f, -0.27f, 0.8f, 0.0f)
                lineTo(9.0f, 15.0f)
                lineToRelative(2.23f, -2.97f)
                curveToRelative(0.2f, -0.27f, 0.6f, -0.27f, 0.8f, 0.0f)
                lineToRelative(2.38f, 3.17f)
                curveToRelative(0.25f, 0.33f, 0.01f, 0.8f, -0.4f, 0.8f)
                horizontalLineTo(6.0f)
                curveTo(5.59f, 16.0f, 5.35f, 15.53f, 5.6f, 15.2f)
                close()
            }
        }
        .build()
        return _videoCameraBack!!
    }

private var _videoCameraBack: ImageVector? = null
