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

public val FilledGroup.PersonFeedback: ImageVector
    get() {
        if (_personFeedback != null) {
            return _personFeedback!!
        }
        _personFeedback = Builder(name = "PersonFeedback", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.75f, 14.0f)
                curveTo(11.9926f, 14.0f, 13.0f, 15.0074f, 13.0f, 16.25f)
                verticalLineTo(17.752f)
                lineTo(12.9921f, 17.8604f)
                curveTo(12.6814f, 19.9866f, 10.7715f, 21.009f, 7.5668f, 21.009f)
                curveTo(4.3736f, 21.009f, 2.4333f, 19.9983f, 2.0145f, 17.8966f)
                lineTo(2.0f, 17.75f)
                verticalLineTo(16.25f)
                curveTo(2.0f, 15.0074f, 3.0074f, 14.0f, 4.25f, 14.0f)
                horizontalLineTo(10.75f)
                close()
                moveTo(7.5f, 6.0f)
                curveTo(9.433f, 6.0f, 11.0f, 7.567f, 11.0f, 9.5f)
                curveTo(11.0f, 11.433f, 9.433f, 13.0f, 7.5f, 13.0f)
                curveTo(5.567f, 13.0f, 4.0f, 11.433f, 4.0f, 9.5f)
                curveTo(4.0f, 7.567f, 5.567f, 6.0f, 7.5f, 6.0f)
                close()
                moveTo(19.75f, 2.0f)
                curveTo(20.9926f, 2.0f, 22.0f, 3.0074f, 22.0f, 4.25f)
                verticalLineTo(7.75f)
                curveTo(22.0f, 8.9926f, 20.9926f, 10.0f, 19.75f, 10.0f)
                horizontalLineTo(18.1972f)
                lineTo(15.6555f, 12.2071f)
                curveTo(15.2385f, 12.5691f, 14.6069f, 12.5245f, 14.2448f, 12.1075f)
                curveTo(14.0869f, 11.9256f, 14.0f, 11.6928f, 14.0f, 11.4523f)
                lineTo(13.9993f, 9.9862f)
                curveTo(12.8747f, 9.8615f, 12.0f, 8.9079f, 12.0f, 7.75f)
                verticalLineTo(4.25f)
                curveTo(12.0f, 3.0074f, 13.0074f, 2.0f, 14.25f, 2.0f)
                horizontalLineTo(19.75f)
                close()
            }
        }
        .build()
        return _personFeedback!!
    }

private var _personFeedback: ImageVector? = null
