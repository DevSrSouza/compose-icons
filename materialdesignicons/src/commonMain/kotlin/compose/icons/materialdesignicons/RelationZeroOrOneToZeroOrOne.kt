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

public val MaterialDesignIcons.RelationZeroOrOneToZeroOrOne: ImageVector
    get() {
        if (_relationZeroOrOneToZeroOrOne != null) {
            return _relationZeroOrOneToZeroOrOne!!
        }
        _relationZeroOrOneToZeroOrOne = Builder(name = "RelationZeroOrOneToZeroOrOne", defaultWidth
                = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight =
                24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 15.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(18.79f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 14.21f, 15.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(9.79f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 5.21f, 7.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(5.21f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 9.79f, 9.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(14.21f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 18.79f, 17.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(15.0f)
                moveTo(7.5f, 9.0f)
                arcTo(1.0f, 1.0f, 0.0f, true, true, 8.5f, 8.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 7.5f, 9.0f)
                moveTo(16.5f, 17.0f)
                arcTo(1.0f, 1.0f, 0.0f, true, true, 17.5f, 16.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 16.5f, 17.0f)
                close()
            }
        }
        .build()
        return _relationZeroOrOneToZeroOrOne!!
    }

private var _relationZeroOrOneToZeroOrOne: ImageVector? = null
