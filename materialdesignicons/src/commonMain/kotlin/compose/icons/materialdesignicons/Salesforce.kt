package compose.icons.materialdesignicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.MaterialDesignIcons

public val MaterialDesignIcons.Salesforce: ImageVector
    get() {
        if (_salesforce != null) {
            return _salesforce!!
        }
        _salesforce = Builder(name = "Salesforce", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.38f, 6.37f)
                curveTo(17.68f, 6.37f, 17.07f, 6.58f, 16.47f, 6.78f)
                curveTo(15.77f, 5.57f, 14.46f, 4.77f, 13.05f, 4.77f)
                curveTo(11.95f, 4.77f, 10.95f, 5.27f, 10.24f, 5.97f)
                curveTo(9.44f, 4.97f, 8.23f, 4.26f, 6.83f, 4.26f)
                curveTo(4.5f, 4.26f, 2.5f, 6.17f, 2.5f, 8.5f)
                curveTo(2.5f, 9.09f, 2.71f, 9.69f, 2.91f, 10.29f)
                curveTo(1.8f, 10.9f, 1.0f, 12.1f, 1.0f, 13.5f)
                curveTo(1.0f, 15.5f, 2.61f, 17.22f, 4.62f, 17.22f)
                curveTo(4.92f, 17.22f, 5.22f, 17.22f, 5.42f, 17.12f)
                curveTo(5.82f, 18.63f, 7.33f, 19.74f, 9.14f, 19.74f)
                curveTo(10.84f, 19.74f, 12.25f, 18.73f, 12.75f, 17.32f)
                curveTo(13.26f, 17.53f, 13.76f, 17.73f, 14.26f, 17.73f)
                curveTo(15.57f, 17.73f, 16.77f, 17.0f, 17.37f, 15.92f)
                curveTo(17.68f, 16.0f, 18.0f, 16.0f, 18.28f, 16.0f)
                curveTo(20.89f, 16.0f, 23.0f, 13.91f, 23.0f, 11.2f)
                curveTo(23.1f, 8.5f, 21.0f, 6.37f, 18.38f, 6.37f)
                close()
            }
        }
        .build()
        return _salesforce!!
    }

private var _salesforce: ImageVector? = null
