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

public val MaterialDesignIcons.GoogleCardboard: ImageVector
    get() {
        if (_googleCardboard != null) {
            return _googleCardboard!!
        }
        _googleCardboard = Builder(name = "GoogleCardboard", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.74f, 6.0f)
                horizontalLineTo(3.2f)
                curveTo(2.55f, 6.0f, 2.0f, 6.57f, 2.0f, 7.27f)
                verticalLineTo(17.73f)
                curveTo(2.0f, 18.43f, 2.55f, 19.0f, 3.23f, 19.0f)
                horizontalLineTo(8.0f)
                curveTo(8.54f, 19.0f, 9.0f, 18.68f, 9.16f, 18.21f)
                lineTo(10.55f, 14.74f)
                curveTo(10.79f, 14.16f, 11.35f, 13.75f, 12.0f, 13.75f)
                curveTo(12.65f, 13.75f, 13.21f, 14.16f, 13.45f, 14.74f)
                lineTo(14.84f, 18.21f)
                curveTo(15.03f, 18.68f, 15.46f, 19.0f, 15.95f, 19.0f)
                horizontalLineTo(20.74f)
                curveTo(21.45f, 19.0f, 22.0f, 18.43f, 22.0f, 17.73f)
                verticalLineTo(7.27f)
                curveTo(22.0f, 6.57f, 21.45f, 6.0f, 20.74f, 6.0f)
                moveTo(7.22f, 14.58f)
                curveTo(6.0f, 14.58f, 5.0f, 13.55f, 5.0f, 12.29f)
                curveTo(5.0f, 11.0f, 6.0f, 10.0f, 7.22f, 10.0f)
                curveTo(8.44f, 10.0f, 9.43f, 11.0f, 9.43f, 12.29f)
                curveTo(9.43f, 13.55f, 8.44f, 14.58f, 7.22f, 14.58f)
                moveTo(16.78f, 14.58f)
                curveTo(15.56f, 14.58f, 14.57f, 13.55f, 14.57f, 12.29f)
                curveTo(14.57f, 11.03f, 15.56f, 10.0f, 16.78f, 10.0f)
                curveTo(18.0f, 10.0f, 19.0f, 11.03f, 19.0f, 12.29f)
                curveTo(19.0f, 13.55f, 18.0f, 14.58f, 16.78f, 14.58f)
                close()
            }
        }
        .build()
        return _googleCardboard!!
    }

private var _googleCardboard: ImageVector? = null
