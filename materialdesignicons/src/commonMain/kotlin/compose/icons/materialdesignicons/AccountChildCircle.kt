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

public val MaterialDesignIcons.AccountChildCircle: ImageVector
    get() {
        if (_accountChildCircle != null) {
            return _accountChildCircle!!
        }
        _accountChildCircle = Builder(name = "AccountChildCircle", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 12.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 13.5f, 13.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 12.0f, 15.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 10.5f, 13.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 12.0f, 12.0f)
                moveTo(12.0f, 2.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, true, 22.0f, 12.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, true, 12.0f, 22.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, true, 2.0f, 12.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, true, 12.0f, 2.0f)
                moveTo(12.0f, 16.0f)
                curveTo(12.72f, 16.0f, 13.4f, 16.15f, 14.04f, 16.5f)
                curveTo(14.68f, 16.8f, 15.0f, 17.2f, 15.0f, 17.67f)
                verticalLineTo(19.41f)
                curveTo(16.34f, 18.81f, 17.0f, 18.08f, 17.0f, 17.2f)
                verticalLineTo(12.8f)
                curveTo(17.0f, 12.0f, 16.5f, 11.35f, 15.45f, 10.8f)
                curveTo(14.4f, 10.26f, 13.25f, 10.0f, 12.0f, 10.0f)
                curveTo(10.75f, 10.0f, 9.6f, 10.26f, 8.55f, 10.8f)
                curveTo(7.5f, 11.35f, 7.0f, 12.0f, 7.0f, 12.8f)
                verticalLineTo(17.2f)
                curveTo(7.0f, 18.0f, 7.53f, 18.69f, 8.63f, 19.22f)
                curveTo(9.72f, 19.75f, 10.84f, 20.0f, 12.0f, 20.0f)
                lineTo(13.0f, 19.92f)
                verticalLineTo(17.91f)
                lineTo(12.0f, 18.0f)
                curveTo(11.0f, 18.0f, 10.0f, 17.8f, 9.05f, 17.39f)
                curveTo(9.17f, 17.0f, 9.53f, 16.69f, 10.13f, 16.41f)
                curveTo(10.72f, 16.13f, 11.34f, 16.0f, 12.0f, 16.0f)
                moveTo(12.0f, 4.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 9.5f, 6.5f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 12.0f, 9.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 14.5f, 6.5f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 12.0f, 4.0f)
                close()
            }
        }
        .build()
        return _accountChildCircle!!
    }

private var _accountChildCircle: ImageVector? = null
