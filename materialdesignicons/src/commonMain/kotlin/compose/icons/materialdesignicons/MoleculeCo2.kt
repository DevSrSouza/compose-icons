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

public val MaterialDesignIcons.MoleculeCo2: ImageVector
    get() {
        if (_moleculeCo2 != null) {
            return _moleculeCo2!!
        }
        _moleculeCo2 = Builder(name = "MoleculeCo2", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.0f, 7.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 3.0f, 9.0f)
                verticalLineTo(15.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 5.0f, 17.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(5.0f)
                moveTo(11.0f, 7.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 9.0f, 9.0f)
                verticalLineTo(15.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 11.0f, 17.0f)
                horizontalLineTo(13.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 15.0f, 15.0f)
                verticalLineTo(9.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 13.0f, 7.0f)
                horizontalLineTo(11.0f)
                moveTo(11.0f, 9.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(9.0f)
                moveTo(16.0f, 10.5f)
                verticalLineTo(12.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(13.5f)
                horizontalLineTo(17.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 16.0f, 15.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(20.5f)
                verticalLineTo(16.5f)
                horizontalLineTo(17.5f)
                verticalLineTo(15.0f)
                horizontalLineTo(19.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 20.5f, 13.5f)
                verticalLineTo(12.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 19.0f, 10.5f)
                horizontalLineTo(16.0f)
                close()
            }
        }
        .build()
        return _moleculeCo2!!
    }

private var _moleculeCo2: ImageVector? = null
