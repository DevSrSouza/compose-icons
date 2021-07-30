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

public val CssGgIcons.ArrowLongRightR: ImageVector
    get() {
        if (_arrowLongRightR != null) {
            return _arrowLongRightR!!
        }
        _arrowLongRightR = Builder(name = "ArrowLongRightR", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(19.3514f, 7.7252f)
                lineTo(23.6012f, 11.9607f)
                lineTo(19.3655f, 16.2105f)
                lineTo(17.9489f, 14.7987f)
                lineTo(19.7633f, 12.9781f)
                lineTo(7.8974f, 13.0188f)
                lineTo(4.6415f, 16.2748f)
                lineTo(0.3989f, 12.0321f)
                lineTo(4.6415f, 7.7895f)
                lineTo(7.8709f, 11.0189f)
                lineTo(19.782f, 10.9781f)
                lineTo(17.9395f, 9.1419f)
                lineTo(19.3514f, 7.7252f)
                close()
                moveTo(4.6415f, 13.4463f)
                lineTo(6.0557f, 12.0321f)
                lineTo(4.6415f, 10.6179f)
                lineTo(3.2273f, 12.0321f)
                lineTo(4.6415f, 13.4463f)
                close()
            }
        }
        .build()
        return _arrowLongRightR!!
    }

private var _arrowLongRightR: ImageVector? = null
