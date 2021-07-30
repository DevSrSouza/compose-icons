package compose.icons.cssggicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.CssGgIcons

public val CssGgIcons.Music: ImageVector
    get() {
        if (_music != null) {
            return _music!!
        }
        _music = Builder(name = "Music", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(22.0f, 6.0009f)
                curveTo(22.0f, 3.5493f, 19.8148f, 1.6746f, 17.3918f, 2.0474f)
                lineTo(10.3918f, 3.1243f)
                curveTo(8.4404f, 3.4245f, 7.0f, 5.1035f, 7.0f, 7.0778f)
                verticalLineTo(15.8407f)
                curveTo(6.5454f, 15.6248f, 6.0368f, 15.5039f, 5.5f, 15.5039f)
                curveTo(3.567f, 15.5039f, 2.0f, 17.0709f, 2.0f, 19.0039f)
                curveTo(2.0f, 20.9369f, 3.567f, 22.5039f, 5.5f, 22.5039f)
                curveTo(7.433f, 22.5039f, 8.9999f, 20.937f, 9.0f, 19.004f)
                verticalLineTo(7.0778f)
                curveTo(9.0f, 6.0906f, 9.7202f, 5.2511f, 10.6959f, 5.101f)
                lineTo(17.6959f, 4.0241f)
                curveTo(18.9074f, 3.8377f, 20.0f, 4.7751f, 20.0f, 6.0009f)
                verticalLineTo(12.8407f)
                curveTo(19.5454f, 12.6248f, 19.0368f, 12.5039f, 18.5f, 12.5039f)
                curveTo(16.567f, 12.5039f, 15.0f, 14.0709f, 15.0f, 16.0039f)
                curveTo(15.0f, 17.9369f, 16.567f, 19.5039f, 18.5f, 19.5039f)
                curveTo(20.433f, 19.5039f, 21.9999f, 17.937f, 22.0f, 16.004f)
                verticalLineTo(6.0009f)
                close()
                moveTo(20.0f, 16.0039f)
                curveTo(20.0f, 15.1755f, 19.3284f, 14.5039f, 18.5f, 14.5039f)
                curveTo(17.6716f, 14.5039f, 17.0f, 15.1755f, 17.0f, 16.0039f)
                curveTo(17.0f, 16.8323f, 17.6716f, 17.5039f, 18.5f, 17.5039f)
                curveTo(19.3284f, 17.5039f, 19.9999f, 16.8323f, 20.0f, 16.0039f)
                close()
                moveTo(7.0f, 19.0039f)
                curveTo(7.0f, 18.1755f, 6.3284f, 17.5039f, 5.5f, 17.5039f)
                curveTo(4.6716f, 17.5039f, 4.0f, 18.1755f, 4.0f, 19.0039f)
                curveTo(4.0f, 19.8323f, 4.6716f, 20.5039f, 5.5f, 20.5039f)
                curveTo(6.3284f, 20.5039f, 6.9999f, 19.8323f, 7.0f, 19.0039f)
                close()
            }
        }
        .build()
        return _music!!
    }

private var _music: ImageVector? = null
