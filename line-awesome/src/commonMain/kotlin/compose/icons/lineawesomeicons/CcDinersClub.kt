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

public val LineAwesomeIcons.CcDinersClub: ImageVector
    get() {
        if (_ccDinersClub != null) {
            return _ccDinersClub!!
        }
        _ccDinersClub = Builder(name = "CcDinersClub", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.0f, 6.0f)
                curveTo(3.355f, 6.0f, 2.0f, 7.355f, 2.0f, 9.0f)
                lineTo(2.0f, 23.0f)
                curveTo(2.0f, 24.645f, 3.355f, 26.0f, 5.0f, 26.0f)
                lineTo(27.0f, 26.0f)
                curveTo(28.645f, 26.0f, 30.0f, 24.645f, 30.0f, 23.0f)
                lineTo(30.0f, 9.0f)
                curveTo(30.0f, 7.355f, 28.645f, 6.0f, 27.0f, 6.0f)
                close()
                moveTo(5.0f, 8.0f)
                lineTo(27.0f, 8.0f)
                curveTo(27.566f, 8.0f, 28.0f, 8.434f, 28.0f, 9.0f)
                lineTo(28.0f, 23.0f)
                curveTo(28.0f, 23.566f, 27.566f, 24.0f, 27.0f, 24.0f)
                lineTo(5.0f, 24.0f)
                curveTo(4.434f, 24.0f, 4.0f, 23.566f, 4.0f, 23.0f)
                lineTo(4.0f, 9.0f)
                curveTo(4.0f, 8.434f, 4.434f, 8.0f, 5.0f, 8.0f)
                close()
                moveTo(15.0f, 10.0f)
                curveTo(11.699f, 10.0f, 9.0f, 12.699f, 9.0f, 16.0f)
                curveTo(9.0f, 19.301f, 11.699f, 22.0f, 15.0f, 22.0f)
                lineTo(17.0f, 22.0f)
                curveTo(20.313f, 22.0f, 23.0f, 19.313f, 23.0f, 16.0f)
                curveTo(23.0f, 12.688f, 20.313f, 10.0f, 17.0f, 10.0f)
                close()
                moveTo(15.0f, 12.0f)
                curveTo(17.223f, 12.0f, 19.0f, 13.777f, 19.0f, 16.0f)
                curveTo(19.0f, 18.223f, 17.223f, 20.0f, 15.0f, 20.0f)
                curveTo(12.777f, 20.0f, 11.0f, 18.223f, 11.0f, 16.0f)
                curveTo(11.0f, 13.777f, 12.777f, 12.0f, 15.0f, 12.0f)
                close()
                moveTo(14.188f, 13.656f)
                curveTo(13.215f, 14.0f, 12.5f, 14.91f, 12.5f, 16.0f)
                curveTo(12.5f, 17.09f, 13.215f, 18.0f, 14.188f, 18.344f)
                close()
                moveTo(15.813f, 13.656f)
                lineTo(15.813f, 18.344f)
                curveTo(16.785f, 18.0f, 17.5f, 17.09f, 17.5f, 16.0f)
                curveTo(17.5f, 14.91f, 16.785f, 14.0f, 15.813f, 13.656f)
                close()
            }
        }
        .build()
        return _ccDinersClub!!
    }

private var _ccDinersClub: ImageVector? = null
