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

public val MaterialDesignIcons.NavigationVariantOutline: ImageVector
    get() {
        if (_navigationVariantOutline != null) {
            return _navigationVariantOutline!!
        }
        _navigationVariantOutline = Builder(name = "NavigationVariantOutline", defaultWidth =
                24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight =
                24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.27f, 6.73f)
                lineTo(13.03f, 16.86f)
                lineTo(11.71f, 13.44f)
                lineTo(11.39f, 12.61f)
                lineTo(10.57f, 12.29f)
                lineTo(7.14f, 10.96f)
                lineTo(17.27f, 6.73f)
                moveTo(21.0f, 3.0f)
                lineTo(3.0f, 10.53f)
                verticalLineTo(11.5f)
                lineTo(9.84f, 14.16f)
                lineTo(12.5f, 21.0f)
                horizontalLineTo(13.46f)
                lineTo(21.0f, 3.0f)
                close()
            }
        }
        .build()
        return _navigationVariantOutline!!
    }

private var _navigationVariantOutline: ImageVector? = null
