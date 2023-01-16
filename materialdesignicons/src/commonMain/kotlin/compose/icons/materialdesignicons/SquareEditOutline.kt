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

public val MaterialDesignIcons.SquareEditOutline: ImageVector
    get() {
        if (_squareEditOutline != null) {
            return _squareEditOutline!!
        }
        _squareEditOutline = Builder(name = "SquareEditOutline", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.0f, 3.0f)
                curveTo(3.89f, 3.0f, 3.0f, 3.89f, 3.0f, 5.0f)
                verticalLineTo(19.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 5.0f, 21.0f)
                horizontalLineTo(19.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 21.0f, 19.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(12.0f)
                verticalLineTo(3.0f)
                horizontalLineTo(5.0f)
                moveTo(17.78f, 4.0f)
                curveTo(17.61f, 4.0f, 17.43f, 4.07f, 17.3f, 4.2f)
                lineTo(16.08f, 5.41f)
                lineTo(18.58f, 7.91f)
                lineTo(19.8f, 6.7f)
                curveTo(20.06f, 6.44f, 20.06f, 6.0f, 19.8f, 5.75f)
                lineTo(18.25f, 4.2f)
                curveTo(18.12f, 4.07f, 17.95f, 4.0f, 17.78f, 4.0f)
                moveTo(15.37f, 6.12f)
                lineTo(8.0f, 13.5f)
                verticalLineTo(16.0f)
                horizontalLineTo(10.5f)
                lineTo(17.87f, 8.62f)
                lineTo(15.37f, 6.12f)
                close()
            }
        }
        .build()
        return _squareEditOutline!!
    }

private var _squareEditOutline: ImageVector? = null
