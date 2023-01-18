package compose.icons.fluentuiicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fluentuiicons.FilledGroup

public val FilledGroup.PeopleQueue: ImageVector
    get() {
        if (_peopleQueue != null) {
            return _peopleQueue!!
        }
        _peopleQueue = Builder(name = "PeopleQueue", defaultWidth = 25.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 25.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.916f, 6.0f)
                curveTo(10.916f, 7.6568f, 9.5729f, 9.0f, 7.916f, 9.0f)
                curveTo(6.2592f, 9.0f, 4.916f, 7.6568f, 4.916f, 6.0f)
                curveTo(4.916f, 4.3432f, 6.2592f, 3.0f, 7.916f, 3.0f)
                curveTo(9.5729f, 3.0f, 10.916f, 4.3432f, 10.916f, 6.0f)
                close()
                moveTo(5.166f, 10.0f)
                curveTo(4.1995f, 10.0f, 3.416f, 10.7835f, 3.416f, 11.75f)
                verticalLineTo(16.5f)
                curveTo(3.416f, 18.9853f, 5.4307f, 21.0f, 7.916f, 21.0f)
                curveTo(10.4013f, 21.0f, 12.416f, 18.9853f, 12.416f, 16.5f)
                verticalLineTo(11.75f)
                curveTo(12.416f, 10.7835f, 11.6325f, 10.0f, 10.666f, 10.0f)
                horizontalLineTo(5.166f)
                close()
                moveTo(11.2762f, 20.8544f)
                curveTo(12.5777f, 19.8486f, 13.4159f, 18.2722f, 13.4159f, 16.5f)
                verticalLineTo(11.75f)
                curveTo(13.4159f, 11.0852f, 13.18f, 10.4755f, 12.7873f, 10.0f)
                horizontalLineTo(15.1659f)
                curveTo(16.1324f, 10.0f, 16.9159f, 10.7835f, 16.9159f, 11.75f)
                verticalLineTo(16.5f)
                curveTo(16.9159f, 18.9853f, 14.9012f, 21.0f, 12.4159f, 21.0f)
                curveTo(12.0221f, 21.0f, 11.6402f, 20.9494f, 11.2762f, 20.8544f)
                close()
                moveTo(11.9159f, 6.0f)
                curveTo(11.9159f, 6.9994f, 11.5493f, 7.9132f, 10.9434f, 8.6144f)
                curveTo(11.3784f, 8.8599f, 11.8808f, 9.0f, 12.4159f, 9.0f)
                curveTo(14.0727f, 9.0f, 15.4159f, 7.6568f, 15.4159f, 6.0f)
                curveTo(15.4159f, 4.3432f, 14.0727f, 3.0f, 12.4159f, 3.0f)
                curveTo(11.8808f, 3.0f, 11.3784f, 3.1401f, 10.9434f, 3.3856f)
                curveTo(11.5493f, 4.0868f, 11.9159f, 5.0006f, 11.9159f, 6.0f)
                close()
                moveTo(15.7762f, 20.8544f)
                curveTo(17.0777f, 19.8486f, 17.9159f, 18.2722f, 17.9159f, 16.5f)
                verticalLineTo(11.75f)
                curveTo(17.9159f, 11.0852f, 17.68f, 10.4755f, 17.2873f, 10.0f)
                horizontalLineTo(19.6659f)
                curveTo(20.6324f, 10.0f, 21.4159f, 10.7835f, 21.4159f, 11.75f)
                verticalLineTo(16.5f)
                curveTo(21.4159f, 18.9853f, 19.4012f, 21.0f, 16.9159f, 21.0f)
                curveTo(16.5221f, 21.0f, 16.1402f, 20.9494f, 15.7762f, 20.8544f)
                close()
                moveTo(16.4159f, 6.0f)
                curveTo(16.4159f, 6.9994f, 16.0493f, 7.9132f, 15.4434f, 8.6144f)
                curveTo(15.8784f, 8.8599f, 16.3808f, 9.0f, 16.9159f, 9.0f)
                curveTo(18.5727f, 9.0f, 19.9159f, 7.6568f, 19.9159f, 6.0f)
                curveTo(19.9159f, 4.3432f, 18.5727f, 3.0f, 16.9159f, 3.0f)
                curveTo(16.3808f, 3.0f, 15.8784f, 3.1401f, 15.4434f, 3.3856f)
                curveTo(16.0493f, 4.0868f, 16.4159f, 5.0006f, 16.4159f, 6.0f)
                close()
            }
        }
        .build()
        return _peopleQueue!!
    }

private var _peopleQueue: ImageVector? = null
