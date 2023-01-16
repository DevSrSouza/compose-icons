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

public val MaterialDesignIcons.SelectionSearch: ImageVector
    get() {
        if (_selectionSearch != null) {
            return _selectionSearch!!
        }
        _selectionSearch = Builder(name = "SelectionSearch", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.27f, 18.9f)
                curveTo(19.7f, 18.21f, 19.95f, 17.38f, 19.95f, 16.5f)
                curveTo(19.95f, 14.0f, 17.95f, 12.0f, 15.46f, 12.0f)
                reflectiveCurveTo(10.96f, 14.0f, 10.96f, 16.5f)
                reflectiveCurveTo(12.96f, 21.0f, 15.46f, 21.0f)
                curveTo(16.33f, 21.0f, 17.15f, 20.75f, 17.84f, 20.32f)
                lineTo(20.96f, 23.39f)
                lineTo(22.35f, 22.0f)
                lineTo(19.27f, 18.9f)
                moveTo(15.46f, 19.0f)
                curveTo(14.07f, 19.0f, 12.96f, 17.88f, 12.96f, 16.5f)
                reflectiveCurveTo(14.07f, 14.0f, 15.46f, 14.0f)
                reflectiveCurveTo(17.95f, 15.12f, 17.95f, 16.5f)
                reflectiveCurveTo(16.84f, 19.0f, 15.46f, 19.0f)
                moveTo(22.0f, 14.0f)
                horizontalLineTo(21.45f)
                curveTo(21.12f, 13.19f, 20.62f, 12.47f, 20.0f, 11.86f)
                verticalLineTo(10.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(14.0f)
                moveTo(20.0f, 4.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(2.0f)
                horizontalLineTo(20.0f)
                curveTo(21.11f, 2.0f, 22.0f, 2.9f, 22.0f, 4.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(4.0f)
                moveTo(14.0f, 4.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(2.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(4.0f)
                moveTo(4.0f, 2.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(4.0f)
                curveTo(2.0f, 2.89f, 2.9f, 2.0f, 4.0f, 2.0f)
                moveTo(12.0f, 22.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(20.0f)
                curveTo(10.5f, 20.82f, 11.2f, 21.5f, 12.0f, 22.0f)
                moveTo(4.0f, 20.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(4.0f)
                curveTo(2.9f, 22.0f, 2.0f, 21.11f, 2.0f, 20.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(20.0f)
                moveTo(4.0f, 14.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(14.0f)
                close()
            }
        }
        .build()
        return _selectionSearch!!
    }

private var _selectionSearch: ImageVector? = null
