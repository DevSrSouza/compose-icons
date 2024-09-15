package compose.icons.lineawesomeicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.LineAwesomeIcons

public val LineAwesomeIcons.RProject: ImageVector
    get() {
        if (_rProject != null) {
            return _rProject!!
        }
        _rProject = Builder(name = "RProject", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 5.0f)
                curveTo(8.268f, 5.0f, 2.0f, 9.253f, 2.0f, 14.5f)
                curveTo(2.0f, 19.285f, 7.218f, 23.233f, 14.0f, 23.893f)
                lineTo(14.0f, 26.0f)
                lineTo(18.0f, 26.0f)
                lineTo(18.0f, 23.893f)
                curveTo(19.324f, 23.764f, 20.586f, 23.512f, 21.764f, 23.15f)
                lineTo(23.33f, 26.0f)
                lineTo(28.0f, 26.0f)
                lineTo(25.301f, 21.586f)
                curveTo(28.178f, 19.846f, 30.0f, 17.321f, 30.0f, 14.5f)
                curveTo(30.0f, 9.253f, 23.732f, 5.0f, 16.0f, 5.0f)
                close()
                moveTo(17.5f, 8.0f)
                curveTo(23.299f, 8.0f, 28.0f, 11.134f, 28.0f, 15.0f)
                curveTo(28.0f, 17.13f, 26.568f, 19.034f, 24.316f, 20.318f)
                curveTo(24.089f, 20.131f, 23.839f, 19.976f, 23.566f, 19.859f)
                curveTo(25.534f, 19.378f, 27.0f, 17.616f, 27.0f, 15.5f)
                curveTo(27.0f, 13.015f, 24.985f, 11.0f, 22.5f, 11.0f)
                lineTo(14.0f, 11.0f)
                lineTo(14.0f, 21.594f)
                curveTo(9.924f, 20.632f, 7.0f, 18.047f, 7.0f, 15.0f)
                curveTo(7.0f, 11.134f, 11.701f, 8.0f, 17.5f, 8.0f)
                close()
                moveTo(18.0f, 14.0f)
                lineTo(21.5f, 14.0f)
                curveTo(22.328f, 14.0f, 23.0f, 14.672f, 23.0f, 15.5f)
                curveTo(23.0f, 16.328f, 22.328f, 17.0f, 21.5f, 17.0f)
                lineTo(18.0f, 17.0f)
                lineTo(18.0f, 14.0f)
                close()
                moveTo(18.0f, 20.0f)
                lineTo(19.129f, 20.0f)
                curveTo(19.687f, 20.0f, 20.199f, 20.304f, 20.467f, 20.793f)
                lineTo(20.918f, 21.613f)
                curveTo(19.996f, 21.825f, 19.018f, 21.95f, 18.0f, 21.982f)
                lineTo(18.0f, 20.0f)
                close()
            }
        }
        .build()
        return _rProject!!
    }

private var _rProject: ImageVector? = null
