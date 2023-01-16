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

public val MaterialDesignIcons.OfficeBuildingMinus: ImageVector
    get() {
        if (_officeBuildingMinus != null) {
            return _officeBuildingMinus!!
        }
        _officeBuildingMinus = Builder(name = "OfficeBuildingMinus", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.4f, 21.0f)
                curveTo(13.2f, 20.4f, 13.0f, 19.7f, 13.0f, 19.0f)
                curveTo(13.0f, 17.5f, 13.6f, 16.1f, 14.5f, 15.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(14.5f)
                curveTo(15.6f, 14.0f, 16.3f, 13.6f, 17.0f, 13.3f)
                verticalLineTo(3.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(17.5f)
                horizontalLineTo(11.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(13.4f)
                moveTo(13.0f, 5.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(5.0f)
                moveTo(13.0f, 9.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(9.0f)
                moveTo(7.0f, 19.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(19.0f)
                moveTo(7.0f, 15.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(15.0f)
                moveTo(7.0f, 11.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(11.0f)
                moveTo(7.0f, 7.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(7.0f)
                moveTo(9.0f, 5.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(5.0f)
                moveTo(9.0f, 9.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(9.0f)
                moveTo(9.0f, 15.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(9.0f)
                moveTo(23.0f, 18.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(23.0f)
                close()
            }
        }
        .build()
        return _officeBuildingMinus!!
    }

private var _officeBuildingMinus: ImageVector? = null
