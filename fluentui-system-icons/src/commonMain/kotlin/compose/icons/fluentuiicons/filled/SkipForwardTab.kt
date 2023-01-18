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

public val FilledGroup.SkipForwardTab: ImageVector
    get() {
        if (_skipForwardTab != null) {
            return _skipForwardTab!!
        }
        _skipForwardTab = Builder(name = "SkipForwardTab", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 3.25f)
                curveTo(22.0f, 2.6977f, 21.5523f, 2.25f, 21.0f, 2.25f)
                curveTo(20.4477f, 2.25f, 20.0f, 2.6977f, 20.0f, 3.25f)
                verticalLineTo(5.9786f)
                curveTo(18.9321f, 4.8993f, 17.622f, 4.0075f, 16.0458f, 3.5198f)
                curveTo(13.6152f, 2.7676f, 11.0335f, 2.8302f, 8.6515f, 3.7162f)
                curveTo(6.2878f, 4.5955f, 4.0483f, 6.3799f, 2.8733f, 8.5228f)
                curveTo(2.6078f, 9.007f, 2.7851f, 9.6149f, 3.2694f, 9.8804f)
                curveTo(3.7537f, 10.1459f, 4.3615f, 9.9686f, 4.627f, 9.4843f)
                curveTo(5.5385f, 7.822f, 7.3678f, 6.3277f, 9.3488f, 5.5908f)
                curveTo(11.3117f, 4.8606f, 13.4401f, 4.8071f, 15.4546f, 5.4304f)
                curveTo(16.9286f, 5.8866f, 18.1525f, 6.8215f, 19.1369f, 8.0f)
                horizontalLineTo(15.75f)
                curveTo(15.1977f, 8.0f, 14.75f, 8.4478f, 14.75f, 9.0001f)
                curveTo(14.75f, 9.5523f, 15.1977f, 10.0001f, 15.75f, 10.0001f)
                horizontalLineTo(21.0f)
                curveTo(21.5523f, 10.0001f, 22.0f, 9.5523f, 22.0f, 9.0001f)
                verticalLineTo(3.25f)
                close()
                moveTo(6.0f, 15.0f)
                curveTo(6.0f, 13.8954f, 6.8954f, 13.0f, 8.0f, 13.0f)
                horizontalLineTo(16.0f)
                curveTo(17.1046f, 13.0f, 18.0f, 13.8954f, 18.0f, 15.0f)
                verticalLineTo(19.0f)
                curveTo(18.0f, 20.1046f, 17.1046f, 21.0f, 16.0f, 21.0f)
                horizontalLineTo(8.0f)
                curveTo(6.8954f, 21.0f, 6.0f, 20.1046f, 6.0f, 19.0f)
                verticalLineTo(15.0f)
                close()
                moveTo(8.0f, 15.5f)
                verticalLineTo(18.5f)
                curveTo(8.0f, 18.7761f, 8.2239f, 19.0f, 8.5f, 19.0f)
                horizontalLineTo(15.5f)
                curveTo(15.7761f, 19.0f, 16.0f, 18.7761f, 16.0f, 18.5f)
                verticalLineTo(15.5f)
                curveTo(16.0f, 15.2239f, 15.7761f, 15.0f, 15.5f, 15.0f)
                horizontalLineTo(8.5f)
                curveTo(8.2239f, 15.0f, 8.0f, 15.2239f, 8.0f, 15.5f)
                close()
            }
        }
        .build()
        return _skipForwardTab!!
    }

private var _skipForwardTab: ImageVector? = null
