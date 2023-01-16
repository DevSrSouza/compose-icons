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

public val MaterialDesignIcons.HammerScrewdriver: ImageVector
    get() {
        if (_hammerScrewdriver != null) {
            return _hammerScrewdriver!!
        }
        _hammerScrewdriver = Builder(name = "HammerScrewdriver", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.06f, 13.09f)
                lineTo(21.69f, 18.68f)
                lineTo(18.37f, 21.96f)
                lineTo(12.78f, 16.37f)
                verticalLineTo(15.45f)
                lineTo(15.14f, 13.09f)
                horizontalLineTo(16.06f)
                moveTo(16.97f, 10.56f)
                lineTo(16.0f, 9.6f)
                lineTo(11.21f, 14.4f)
                verticalLineTo(16.37f)
                lineTo(5.58f, 22.0f)
                lineTo(2.3f, 18.68f)
                lineTo(7.89f, 13.09f)
                horizontalLineTo(9.86f)
                lineTo(10.64f, 12.31f)
                lineTo(6.8f, 8.46f)
                horizontalLineTo(5.5f)
                lineTo(2.69f, 5.62f)
                lineTo(5.31f, 3.0f)
                lineTo(8.11f, 5.8f)
                verticalLineTo(7.11f)
                lineTo(12.0f, 10.95f)
                lineTo(14.66f, 8.29f)
                lineTo(13.7f, 7.28f)
                lineTo(15.0f, 5.97f)
                horizontalLineTo(12.34f)
                lineTo(11.69f, 5.32f)
                lineTo(15.0f, 2.0f)
                lineTo(15.66f, 2.66f)
                verticalLineTo(5.32f)
                lineTo(16.97f, 4.0f)
                lineTo(20.25f, 7.28f)
                curveTo(21.34f, 8.38f, 21.34f, 10.17f, 20.25f, 11.26f)
                lineTo(18.28f, 9.25f)
                lineTo(16.97f, 10.56f)
                close()
            }
        }
        .build()
        return _hammerScrewdriver!!
    }

private var _hammerScrewdriver: ImageVector? = null
