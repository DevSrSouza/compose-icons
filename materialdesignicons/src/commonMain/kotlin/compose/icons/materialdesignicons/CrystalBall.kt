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

public val MaterialDesignIcons.CrystalBall: ImageVector
    get() {
        if (_crystalBall != null) {
            return _crystalBall!!
        }
        _crystalBall = Builder(name = "CrystalBall", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.38f, 8.38f)
                lineTo(11.5f, 9.34f)
                lineTo(13.62f, 8.38f)
                lineTo(12.66f, 10.5f)
                lineTo(13.62f, 12.62f)
                lineTo(11.5f, 11.66f)
                lineTo(9.38f, 12.62f)
                lineTo(10.34f, 10.5f)
                lineTo(9.38f, 8.38f)
                moveTo(16.5f, 2.5f)
                lineTo(17.59f, 5.41f)
                lineTo(20.5f, 6.5f)
                lineTo(17.59f, 7.59f)
                lineTo(16.5f, 10.5f)
                lineTo(15.41f, 7.59f)
                lineTo(12.5f, 6.5f)
                lineTo(15.41f, 5.41f)
                lineTo(16.5f, 2.5f)
                moveTo(6.0f, 19.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(18.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 8.0f, 17.0f)
                horizontalLineTo(8.26f)
                curveTo(6.0f, 15.7f, 4.5f, 13.28f, 4.5f, 10.5f)
                arcTo(7.5f, 7.5f, 0.0f, false, true, 12.0f, 3.0f)
                curveTo(13.05f, 3.0f, 14.05f, 3.22f, 14.96f, 3.61f)
                lineTo(14.59f, 4.59f)
                lineTo(13.17f, 5.12f)
                curveTo(12.79f, 5.04f, 12.4f, 5.0f, 12.0f, 5.0f)
                arcTo(5.5f, 5.5f, 0.0f, false, false, 6.5f, 10.5f)
                arcTo(5.5f, 5.5f, 0.0f, false, false, 12.0f, 16.0f)
                curveTo(14.91f, 16.0f, 17.3f, 13.73f, 17.5f, 10.87f)
                lineTo(18.41f, 8.41f)
                lineTo(19.12f, 8.14f)
                curveTo(19.37f, 8.88f, 19.5f, 9.68f, 19.5f, 10.5f)
                curveTo(19.5f, 13.28f, 18.0f, 15.7f, 15.74f, 17.0f)
                horizontalLineTo(16.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 17.0f, 18.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(18.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 20.0f, 21.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(21.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 6.0f, 19.0f)
                close()
            }
        }
        .build()
        return _crystalBall!!
    }

private var _crystalBall: ImageVector? = null
