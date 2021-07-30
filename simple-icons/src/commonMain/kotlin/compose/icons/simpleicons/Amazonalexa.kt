package compose.icons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.SimpleIcons

public val SimpleIcons.Amazonalexa: ImageVector
    get() {
        if (_amazonalexa != null) {
            return _amazonalexa!!
        }
        _amazonalexa = Builder(name = "Amazonalexa", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 0.0f)
                curveTo(5.37f, 0.0f, 0.0f, 5.37f, 0.0f, 12.0f)
                curveTo(0.0f, 18.09f, 4.53f, 23.11f, 10.4f, 23.9f)
                verticalLineTo(21.5f)
                arcTo(1.59f, 1.59f, 0.0f, false, false, 9.32f, 19.97f)
                arcTo(8.41f, 8.41f, 0.0f, false, true, 3.6f, 11.8f)
                arcTo(8.37f, 8.37f, 0.0f, false, true, 12.09f, 3.6f)
                arcTo(8.4f, 8.4f, 0.0f, false, true, 20.4f, 12.31f)
                lineTo(20.39f, 12.38f)
                arcTo(8.68f, 8.68f, 0.0f, false, true, 20.36f, 12.76f)
                curveTo(20.36f, 12.83f, 20.35f, 12.9f, 20.34f, 12.96f)
                curveTo(20.34f, 13.04f, 20.33f, 13.12f, 20.32f, 13.19f)
                lineTo(20.3f, 13.29f)
                curveTo(19.27f, 20.07f, 10.45f, 23.87f, 10.4f, 23.9f)
                curveTo(10.92f, 23.97f, 11.46f, 24.0f, 12.0f, 24.0f)
                curveTo(18.63f, 24.0f, 24.0f, 18.63f, 24.0f, 12.0f)
                reflectiveCurveTo(18.63f, 0.0f, 12.0f, 0.0f)
                close()
            }
        }
        .build()
        return _amazonalexa!!
    }

private var _amazonalexa: ImageVector? = null
