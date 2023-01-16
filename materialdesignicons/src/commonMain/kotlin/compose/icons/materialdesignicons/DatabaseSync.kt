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

public val MaterialDesignIcons.DatabaseSync: ImageVector
    get() {
        if (_databaseSync != null) {
            return _databaseSync!!
        }
        _databaseSync = Builder(name = "DatabaseSync", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 12.0f)
                verticalLineTo(13.5f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 23.0f, 17.5f)
                curveTo(23.0f, 18.32f, 22.75f, 19.08f, 22.33f, 19.71f)
                lineTo(21.24f, 18.62f)
                curveTo(21.41f, 18.28f, 21.5f, 17.9f, 21.5f, 17.5f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 19.0f, 15.0f)
                verticalLineTo(16.5f)
                lineTo(16.75f, 14.25f)
                lineTo(19.0f, 12.0f)
                moveTo(19.0f, 23.0f)
                verticalLineTo(21.5f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 15.0f, 17.5f)
                curveTo(15.0f, 16.68f, 15.25f, 15.92f, 15.67f, 15.29f)
                lineTo(16.76f, 16.38f)
                curveTo(16.59f, 16.72f, 16.5f, 17.1f, 16.5f, 17.5f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 19.0f, 20.0f)
                verticalLineTo(18.5f)
                lineTo(21.25f, 20.75f)
                lineTo(19.0f, 23.0f)
                moveTo(12.0f, 3.0f)
                curveTo(16.42f, 3.0f, 20.0f, 4.79f, 20.0f, 7.0f)
                curveTo(20.0f, 9.21f, 16.42f, 11.0f, 12.0f, 11.0f)
                curveTo(7.58f, 11.0f, 4.0f, 9.21f, 4.0f, 7.0f)
                curveTo(4.0f, 4.79f, 7.58f, 3.0f, 12.0f, 3.0f)
                moveTo(4.0f, 9.0f)
                curveTo(4.0f, 11.21f, 7.58f, 13.0f, 12.0f, 13.0f)
                curveTo(13.11f, 13.0f, 14.17f, 12.89f, 15.14f, 12.68f)
                curveTo(14.19f, 13.54f, 13.5f, 14.67f, 13.18f, 15.96f)
                lineTo(12.0f, 16.0f)
                curveTo(7.58f, 16.0f, 4.0f, 14.21f, 4.0f, 12.0f)
                verticalLineTo(9.0f)
                moveTo(20.0f, 9.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(19.5f)
                lineTo(18.9f, 11.03f)
                curveTo(19.6f, 10.43f, 20.0f, 9.74f, 20.0f, 9.0f)
                moveTo(4.0f, 14.0f)
                curveTo(4.0f, 16.21f, 7.58f, 18.0f, 12.0f, 18.0f)
                lineTo(13.0f, 17.97f)
                curveTo(13.09f, 19.03f, 13.42f, 20.0f, 13.95f, 20.88f)
                lineTo(12.0f, 21.0f)
                curveTo(7.58f, 21.0f, 4.0f, 19.21f, 4.0f, 17.0f)
                verticalLineTo(14.0f)
                close()
            }
        }
        .build()
        return _databaseSync!!
    }

private var _databaseSync: ImageVector? = null
