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

public val FilledGroup.LearningApp: ImageVector
    get() {
        if (_learningApp != null) {
            return _learningApp!!
        }
        _learningApp = Builder(name = "LearningApp", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.5f, 2.0f)
                horizontalLineTo(17.0f)
                curveTo(18.3807f, 2.0f, 19.5f, 3.1193f, 19.5f, 4.5f)
                verticalLineTo(11.3135f)
                curveTo(18.8699f, 11.11f, 18.1978f, 11.0f, 17.5f, 11.0f)
                curveTo(13.9101f, 11.0f, 11.0f, 13.9101f, 11.0f, 17.5f)
                curveTo(11.0f, 18.1978f, 11.11f, 18.8699f, 11.3135f, 19.5f)
                horizontalLineTo(4.5f)
                curveTo(4.5f, 20.0523f, 4.9477f, 20.5f, 5.5f, 20.5f)
                horizontalLineTo(11.7322f)
                curveTo(12.0194f, 21.051f, 12.3832f, 21.5557f, 12.8096f, 22.0f)
                horizontalLineTo(5.5f)
                curveTo(4.1193f, 22.0f, 3.0f, 20.8807f, 3.0f, 19.5f)
                verticalLineTo(4.5f)
                curveTo(3.0f, 3.1193f, 4.1193f, 2.0f, 5.5f, 2.0f)
                close()
                moveTo(7.0f, 5.0f)
                curveTo(6.4477f, 5.0f, 6.0f, 5.4477f, 6.0f, 6.0f)
                verticalLineTo(7.0f)
                curveTo(6.0f, 7.5523f, 6.4477f, 8.0f, 7.0f, 8.0f)
                horizontalLineTo(15.0f)
                curveTo(15.5523f, 8.0f, 16.0f, 7.5523f, 16.0f, 7.0f)
                verticalLineTo(6.0f)
                curveTo(16.0f, 5.4477f, 15.5523f, 5.0f, 15.0f, 5.0f)
                horizontalLineTo(7.0f)
                close()
                moveTo(23.0f, 17.5f)
                curveTo(23.0f, 14.4624f, 20.5376f, 12.0f, 17.5f, 12.0f)
                curveTo(14.4624f, 12.0f, 12.0f, 14.4624f, 12.0f, 17.5f)
                curveTo(12.0f, 20.5376f, 14.4624f, 23.0f, 17.5f, 23.0f)
                curveTo(20.5376f, 23.0f, 23.0f, 20.5376f, 23.0f, 17.5f)
                close()
                moveTo(16.9138f, 15.097f)
                lineTo(19.7203f, 16.9373f)
                curveTo(19.8073f, 16.9933f, 19.8757f, 17.0677f, 19.9254f, 17.1604f)
                curveTo(19.9751f, 17.251f, 20.0f, 17.3502f, 20.0f, 17.458f)
                curveTo(20.0f, 17.5614f, 19.9762f, 17.6606f, 19.9285f, 17.7555f)
                curveTo(19.8809f, 17.8504f, 19.8146f, 17.9258f, 19.7296f, 17.9819f)
                lineTo(16.9231f, 19.8965f)
                curveTo(16.8713f, 19.931f, 16.8184f, 19.9569f, 16.7646f, 19.9741f)
                curveTo(16.7128f, 19.9914f, 16.6568f, 20.0f, 16.5967f, 20.0f)
                curveTo(16.518f, 20.0f, 16.4424f, 19.9838f, 16.3699f, 19.9515f)
                curveTo(16.2973f, 19.917f, 16.2331f, 19.8717f, 16.1772f, 19.8157f)
                curveTo(16.1233f, 19.7574f, 16.0798f, 19.6906f, 16.0466f, 19.6151f)
                curveTo(16.0155f, 19.5397f, 16.0f, 19.461f, 16.0f, 19.379f)
                verticalLineTo(15.621f)
                curveTo(16.0f, 15.5369f, 16.0155f, 15.4571f, 16.0466f, 15.3816f)
                curveTo(16.0798f, 15.3062f, 16.1233f, 15.2404f, 16.1772f, 15.1843f)
                curveTo(16.231f, 15.1283f, 16.2942f, 15.0841f, 16.3667f, 15.0517f)
                curveTo(16.4393f, 15.0172f, 16.5159f, 15.0f, 16.5967f, 15.0f)
                curveTo(16.7128f, 15.0f, 16.8184f, 15.0323f, 16.9138f, 15.097f)
                close()
            }
        }
        .build()
        return _learningApp!!
    }

private var _learningApp: ImageVector? = null
