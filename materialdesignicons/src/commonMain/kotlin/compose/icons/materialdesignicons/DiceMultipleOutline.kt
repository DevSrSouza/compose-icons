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

public val MaterialDesignIcons.DiceMultipleOutline: ImageVector
    get() {
        if (_diceMultipleOutline != null) {
            return _diceMultipleOutline!!
        }
        _diceMultipleOutline = Builder(name = "DiceMultipleOutline", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.0f, 8.0f)
                curveTo(13.45f, 8.0f, 13.0f, 7.55f, 13.0f, 7.0f)
                reflectiveCurveTo(13.45f, 6.0f, 14.0f, 6.0f)
                curveTo(14.55f, 6.0f, 15.0f, 6.45f, 15.0f, 7.0f)
                curveTo(15.0f, 7.55f, 14.55f, 8.0f, 14.0f, 8.0f)
                moveTo(12.0f, 12.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(12.0f)
                moveTo(12.78f, 10.0f)
                horizontalLineTo(4.22f)
                curveTo(3.55f, 10.0f, 3.0f, 10.55f, 3.0f, 11.22f)
                verticalLineTo(19.78f)
                curveTo(3.0f, 20.45f, 3.55f, 21.0f, 4.22f, 21.0f)
                horizontalLineTo(12.78f)
                curveTo(13.45f, 21.0f, 14.0f, 20.45f, 14.0f, 19.78f)
                verticalLineTo(11.22f)
                curveTo(14.0f, 10.55f, 13.45f, 10.0f, 12.78f, 10.0f)
                moveTo(19.78f, 3.0f)
                horizontalLineTo(11.22f)
                curveTo(10.55f, 3.0f, 10.0f, 3.55f, 10.0f, 4.22f)
                verticalLineTo(8.0f)
                horizontalLineTo(12.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(19.78f)
                curveTo(20.45f, 14.0f, 21.0f, 13.45f, 21.0f, 12.78f)
                verticalLineTo(4.22f)
                curveTo(21.0f, 3.55f, 20.45f, 3.0f, 19.78f, 3.0f)
                moveTo(17.0f, 8.0f)
                curveTo(16.45f, 8.0f, 16.0f, 7.55f, 16.0f, 7.0f)
                reflectiveCurveTo(16.45f, 6.0f, 17.0f, 6.0f)
                curveTo(17.55f, 6.0f, 18.0f, 6.45f, 18.0f, 7.0f)
                curveTo(18.0f, 7.55f, 17.55f, 8.0f, 17.0f, 8.0f)
                moveTo(17.0f, 11.0f)
                curveTo(16.45f, 11.0f, 16.0f, 10.55f, 16.0f, 10.0f)
                reflectiveCurveTo(16.45f, 9.0f, 17.0f, 9.0f)
                curveTo(17.55f, 9.0f, 18.0f, 9.45f, 18.0f, 10.0f)
                curveTo(18.0f, 10.55f, 17.55f, 11.0f, 17.0f, 11.0f)
                moveTo(7.0f, 15.0f)
                curveTo(6.45f, 15.0f, 6.0f, 14.55f, 6.0f, 14.0f)
                reflectiveCurveTo(6.45f, 13.0f, 7.0f, 13.0f)
                curveTo(7.55f, 13.0f, 8.0f, 13.45f, 8.0f, 14.0f)
                curveTo(8.0f, 14.55f, 7.55f, 15.0f, 7.0f, 15.0f)
                moveTo(10.0f, 18.0f)
                curveTo(9.45f, 18.0f, 9.0f, 17.55f, 9.0f, 17.0f)
                reflectiveCurveTo(9.45f, 16.0f, 10.0f, 16.0f)
                curveTo(10.55f, 16.0f, 11.0f, 16.45f, 11.0f, 17.0f)
                curveTo(11.0f, 17.55f, 10.55f, 18.0f, 10.0f, 18.0f)
            }
        }
        .build()
        return _diceMultipleOutline!!
    }

private var _diceMultipleOutline: ImageVector? = null
