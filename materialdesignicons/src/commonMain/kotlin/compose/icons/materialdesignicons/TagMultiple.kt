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

public val MaterialDesignIcons.TagMultiple: ImageVector
    get() {
        if (_tagMultiple != null) {
            return _tagMultiple!!
        }
        _tagMultiple = Builder(name = "TagMultiple", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.5f, 9.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 7.0f, 7.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 5.5f, 6.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 4.0f, 7.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 5.5f, 9.0f)
                moveTo(17.41f, 11.58f)
                curveTo(17.77f, 11.94f, 18.0f, 12.44f, 18.0f, 13.0f)
                curveTo(18.0f, 13.55f, 17.78f, 14.05f, 17.41f, 14.41f)
                lineTo(12.41f, 19.41f)
                curveTo(12.05f, 19.77f, 11.55f, 20.0f, 11.0f, 20.0f)
                curveTo(10.45f, 20.0f, 9.95f, 19.78f, 9.58f, 19.41f)
                lineTo(2.59f, 12.42f)
                curveTo(2.22f, 12.05f, 2.0f, 11.55f, 2.0f, 11.0f)
                verticalLineTo(6.0f)
                curveTo(2.0f, 4.89f, 2.89f, 4.0f, 4.0f, 4.0f)
                horizontalLineTo(9.0f)
                curveTo(9.55f, 4.0f, 10.05f, 4.22f, 10.41f, 4.58f)
                lineTo(17.41f, 11.58f)
                moveTo(13.54f, 5.71f)
                lineTo(14.54f, 4.71f)
                lineTo(21.41f, 11.58f)
                curveTo(21.78f, 11.94f, 22.0f, 12.45f, 22.0f, 13.0f)
                curveTo(22.0f, 13.55f, 21.78f, 14.05f, 21.42f, 14.41f)
                lineTo(16.04f, 19.79f)
                lineTo(15.04f, 18.79f)
                lineTo(20.75f, 13.0f)
                lineTo(13.54f, 5.71f)
                close()
            }
        }
        .build()
        return _tagMultiple!!
    }

private var _tagMultiple: ImageVector? = null
