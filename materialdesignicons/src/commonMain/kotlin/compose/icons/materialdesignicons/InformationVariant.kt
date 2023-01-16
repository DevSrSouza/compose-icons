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

public val MaterialDesignIcons.InformationVariant: ImageVector
    get() {
        if (_informationVariant != null) {
            return _informationVariant!!
        }
        _informationVariant = Builder(name = "InformationVariant", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.5f, 4.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 12.0f, 5.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 13.5f, 7.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 15.0f, 5.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 13.5f, 4.0f)
                moveTo(13.14f, 8.77f)
                curveTo(11.95f, 8.87f, 8.7f, 11.46f, 8.7f, 11.46f)
                curveTo(8.5f, 11.61f, 8.56f, 11.6f, 8.72f, 11.88f)
                curveTo(8.88f, 12.15f, 8.86f, 12.17f, 9.05f, 12.04f)
                curveTo(9.25f, 11.91f, 9.58f, 11.7f, 10.13f, 11.36f)
                curveTo(12.25f, 10.0f, 10.47f, 13.14f, 9.56f, 18.43f)
                curveTo(9.2f, 21.05f, 11.56f, 19.7f, 12.17f, 19.3f)
                curveTo(12.77f, 18.91f, 14.38f, 17.8f, 14.54f, 17.69f)
                curveTo(14.76f, 17.54f, 14.6f, 17.42f, 14.43f, 17.17f)
                curveTo(14.31f, 17.0f, 14.19f, 17.12f, 14.19f, 17.12f)
                curveTo(13.54f, 17.55f, 12.35f, 18.45f, 12.19f, 17.88f)
                curveTo(12.0f, 17.31f, 13.22f, 13.4f, 13.89f, 10.71f)
                curveTo(14.0f, 10.07f, 14.3f, 8.67f, 13.14f, 8.77f)
                close()
            }
        }
        .build()
        return _informationVariant!!
    }

private var _informationVariant: ImageVector? = null
