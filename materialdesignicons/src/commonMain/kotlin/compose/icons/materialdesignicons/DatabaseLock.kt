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

public val MaterialDesignIcons.DatabaseLock: ImageVector
    get() {
        if (_databaseLock != null) {
            return _databaseLock!!
        }
        _databaseLock = Builder(name = "DatabaseLock", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.0f, 3.0f)
                curveTo(15.42f, 3.0f, 19.0f, 4.79f, 19.0f, 7.0f)
                curveTo(19.0f, 9.21f, 15.42f, 11.0f, 11.0f, 11.0f)
                curveTo(6.58f, 11.0f, 3.0f, 9.21f, 3.0f, 7.0f)
                curveTo(3.0f, 4.79f, 6.58f, 3.0f, 11.0f, 3.0f)
                moveTo(19.0f, 12.03f)
                curveTo(17.11f, 12.24f, 15.57f, 13.62f, 15.13f, 15.43f)
                curveTo(13.92f, 15.79f, 12.5f, 16.0f, 11.0f, 16.0f)
                curveTo(6.58f, 16.0f, 3.0f, 14.21f, 3.0f, 12.0f)
                verticalLineTo(9.0f)
                curveTo(3.0f, 11.21f, 6.58f, 13.0f, 11.0f, 13.0f)
                curveTo(15.42f, 13.0f, 19.0f, 11.21f, 19.0f, 9.0f)
                verticalLineTo(12.03f)
                moveTo(14.0f, 17.71f)
                verticalLineTo(20.71f)
                curveTo(13.07f, 20.9f, 12.06f, 21.0f, 11.0f, 21.0f)
                curveTo(6.58f, 21.0f, 3.0f, 19.21f, 3.0f, 17.0f)
                verticalLineTo(14.0f)
                curveTo(3.0f, 16.21f, 6.58f, 18.0f, 11.0f, 18.0f)
                curveTo(12.06f, 18.0f, 13.07f, 17.9f, 14.0f, 17.71f)
                moveTo(19.5f, 14.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 22.0f, 16.5f)
                verticalLineTo(17.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 23.0f, 18.0f)
                verticalLineTo(22.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 22.0f, 23.0f)
                horizontalLineTo(17.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 16.0f, 22.0f)
                verticalLineTo(18.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 17.0f, 17.0f)
                verticalLineTo(16.5f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 19.5f, 14.0f)
                moveTo(19.5f, 15.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 18.0f, 16.5f)
                verticalLineTo(17.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(16.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 19.5f, 15.0f)
                close()
            }
        }
        .build()
        return _databaseLock!!
    }

private var _databaseLock: ImageVector? = null
