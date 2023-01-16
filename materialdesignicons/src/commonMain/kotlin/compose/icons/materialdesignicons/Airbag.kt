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

public val MaterialDesignIcons.Airbag: ImageVector
    get() {
        if (_airbag != null) {
            return _airbag!!
        }
        _airbag = Builder(name = "Airbag", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.0f, 8.0f)
                arcTo(5.0f, 5.0f, 0.0f, false, true, 9.0f, 13.0f)
                arcTo(5.0f, 5.0f, 0.0f, false, true, 4.0f, 8.0f)
                arcTo(5.0f, 5.0f, 0.0f, false, true, 9.0f, 3.0f)
                arcTo(5.0f, 5.0f, 0.0f, false, true, 14.0f, 8.0f)
                moveTo(10.46f, 15.55f)
                lineTo(13.0f, 18.03f)
                lineTo(11.0f, 18.05f)
                lineTo(7.5f, 21.58f)
                lineTo(6.0f, 20.09f)
                lineTo(10.46f, 15.55f)
                moveTo(17.0f, 2.0f)
                curveTo(18.08f, 2.0f, 19.0f, 2.88f, 19.0f, 4.0f)
                curveTo(19.0f, 5.08f, 18.12f, 6.0f, 17.0f, 6.0f)
                curveTo(15.92f, 6.0f, 15.0f, 5.12f, 15.0f, 4.0f)
                curveTo(15.0f, 2.92f, 15.89f, 2.0f, 17.0f, 2.0f)
                moveTo(14.41f, 15.0f)
                horizontalLineTo(11.59f)
                lineTo(17.29f, 20.71f)
                lineTo(18.71f, 19.29f)
                lineTo(14.41f, 15.0f)
                moveTo(15.12f, 14.29f)
                lineTo(19.41f, 18.59f)
                lineTo(19.63f, 18.8f)
                curveTo(19.86f, 18.42f, 20.0f, 18.0f, 20.0f, 17.5f)
                verticalLineTo(9.5f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 17.5f, 7.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 15.0f, 9.5f)
                verticalLineTo(14.17f)
                lineTo(15.12f, 14.29f)
                close()
            }
        }
        .build()
        return _airbag!!
    }

private var _airbag: ImageVector? = null
