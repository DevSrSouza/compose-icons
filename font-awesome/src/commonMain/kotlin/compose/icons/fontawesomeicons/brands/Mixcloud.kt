package compose.icons.fontawesomeicons.brands

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.BrandsGroup

public val BrandsGroup.Mixcloud: ImageVector
    get() {
        if (_mixcloud != null) {
            return _mixcloud!!
        }
        _mixcloud = Builder(name = "Mixcloud", defaultWidth = 640.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 640.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(212.98f, 346.566f)
                horizontalLineTo(179.789f)
                verticalLineTo(195.114f)
                lineTo(185.973f, 173.47f)
                horizontalLineTo(175.262f)
                lineTo(137.127f, 346.566f)
                horizontalLineTo(76.107f)
                lineTo(37.732f, 173.47f)
                horizontalLineTo(27.276f)
                lineTo(33.191f, 195.114f)
                verticalLineTo(346.566f)
                horizontalLineTo(0.0f)
                verticalLineTo(165.0f)
                horizontalLineTo(65.651f)
                lineTo(102.248f, 338.096f)
                horizontalLineTo(110.747f)
                lineTo(147.329f, 165.0f)
                horizontalLineTo(212.98f)
                lineTo(212.98f, 346.566f)
                close()
                moveTo(544.459f, 283.589f)
                lineTo(458.434f, 345.655f)
                verticalLineTo(307.534f)
                lineTo(531.329f, 255.776f)
                lineTo(458.434f, 204.017f)
                verticalLineTo(165.896f)
                lineTo(544.459f, 228.231f)
                horizontalLineTo(553.721f)
                lineTo(640.0f, 165.896f)
                verticalLineTo(204.017f)
                lineTo(566.866f, 255.776f)
                lineTo(640.0f, 307.549f)
                verticalLineTo(345.655f)
                lineTo(553.721f, 283.589f)
                horizontalLineTo(544.459f)
                close()
                moveTo(430.157f, 272.311f)
                horizontalLineTo(248.113f)
                verticalLineTo(239.255f)
                horizontalLineTo(430.157f)
                verticalLineTo(272.311f)
                close()
            }
        }
        .build()
        return _mixcloud!!
    }

private var _mixcloud: ImageVector? = null
