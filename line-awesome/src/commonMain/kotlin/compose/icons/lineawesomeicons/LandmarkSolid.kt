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

public val LineAwesomeIcons.LandmarkSolid: ImageVector
    get() {
        if (_landmarkSolid != null) {
            return _landmarkSolid!!
        }
        _landmarkSolid = Builder(name = "LandmarkSolid", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 3.9063f)
                lineTo(3.625f, 9.0625f)
                lineTo(3.0f, 9.3438f)
                lineTo(3.0f, 12.0f)
                lineTo(5.0f, 12.0f)
                lineTo(5.0f, 23.0f)
                lineTo(3.0f, 23.0f)
                lineTo(3.0f, 28.0f)
                lineTo(29.0f, 28.0f)
                lineTo(29.0f, 23.0f)
                lineTo(27.0f, 23.0f)
                lineTo(27.0f, 12.0f)
                lineTo(29.0f, 12.0f)
                lineTo(29.0f, 9.3438f)
                lineTo(28.375f, 9.0625f)
                close()
                moveTo(16.0f, 6.0938f)
                lineTo(25.375f, 10.0f)
                lineTo(6.625f, 10.0f)
                close()
                moveTo(7.0f, 12.0f)
                lineTo(9.0f, 12.0f)
                lineTo(9.0f, 23.0f)
                lineTo(7.0f, 23.0f)
                close()
                moveTo(11.0f, 12.0f)
                lineTo(13.0f, 12.0f)
                lineTo(13.0f, 23.0f)
                lineTo(11.0f, 23.0f)
                close()
                moveTo(15.0f, 12.0f)
                lineTo(17.0f, 12.0f)
                lineTo(17.0f, 23.0f)
                lineTo(15.0f, 23.0f)
                close()
                moveTo(19.0f, 12.0f)
                lineTo(21.0f, 12.0f)
                lineTo(21.0f, 23.0f)
                lineTo(19.0f, 23.0f)
                close()
                moveTo(23.0f, 12.0f)
                lineTo(25.0f, 12.0f)
                lineTo(25.0f, 23.0f)
                lineTo(23.0f, 23.0f)
                close()
                moveTo(5.0f, 25.0f)
                lineTo(27.0f, 25.0f)
                lineTo(27.0f, 26.0f)
                lineTo(5.0f, 26.0f)
                close()
            }
        }
        .build()
        return _landmarkSolid!!
    }

private var _landmarkSolid: ImageVector? = null
