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

public val MaterialDesignIcons.PhoneMissedOutline: ImageVector
    get() {
        if (_phoneMissedOutline != null) {
            return _phoneMissedOutline!!
        }
        _phoneMissedOutline = Builder(name = "PhoneMissedOutline", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.6f, 15.5f)
                verticalLineToRelative(1.8f)
                curveToRelative(0.7f, 0.4f, 1.3f, 0.8f, 1.9f, 1.3f)
                lineToRelative(1.1f, -1.1f)
                curveToRelative(-0.9f, -0.9f, -1.9f, -1.5f, -3.0f, -2.0f)
                moveToRelative(-13.2f, 0.0f)
                curveToRelative(-1.0f, 0.5f, -2.0f, 1.1f, -2.9f, 1.9f)
                lineToRelative(1.1f, 1.1f)
                curveToRelative(0.6f, -0.5f, 1.2f, -0.9f, 1.9f, -1.3f)
                verticalLineToRelative(-1.7f)
                moveTo(12.0f, 12.0f)
                curveToRelative(4.5f, 0.0f, 8.7f, 1.7f, 11.7f, 4.7f)
                curveToRelative(0.2f, 0.2f, 0.3f, 0.4f, 0.3f, 0.7f)
                curveToRelative(0.0f, 0.3f, -0.1f, 0.5f, -0.3f, 0.7f)
                lineToRelative(-2.5f, 2.5f)
                curveToRelative(-0.2f, 0.2f, -0.4f, 0.3f, -0.7f, 0.3f)
                curveToRelative(-0.2f, 0.0f, -0.5f, -0.1f, -0.7f, -0.3f)
                curveToRelative(-0.8f, -0.7f, -1.7f, -1.4f, -2.7f, -1.8f)
                curveToRelative(-0.3f, -0.2f, -0.6f, -0.5f, -0.6f, -0.9f)
                verticalLineToRelative(-3.1f)
                curveToRelative(-1.5f, -0.5f, -3.0f, -0.7f, -4.6f, -0.7f)
                curveToRelative(-1.6f, 0.0f, -3.1f, 0.2f, -4.6f, 0.7f)
                verticalLineToRelative(3.1f)
                curveToRelative(0.0f, 0.4f, -0.2f, 0.7f, -0.6f, 0.9f)
                curveToRelative(-1.0f, 0.5f, -1.9f, 1.1f, -2.7f, 1.8f)
                curveToRelative(-0.2f, 0.2f, -0.4f, 0.3f, -0.7f, 0.3f)
                curveToRelative(-0.3f, 0.0f, -0.5f, -0.1f, -0.7f, -0.3f)
                lineTo(0.1f, 18.1f)
                curveToRelative(0.0f, -0.2f, -0.1f, -0.5f, -0.1f, -0.7f)
                curveToRelative(0.0f, -0.3f, 0.1f, -0.5f, 0.3f, -0.7f)
                curveTo(3.3f, 13.8f, 7.5f, 12.0f, 12.0f, 12.0f)
                close()
                moveTo(6.5f, 5.5f)
                verticalLineTo(9.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(3.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(1.5f)
                horizontalLineTo(7.5f)
                lineTo(12.0f, 9.0f)
                lineToRelative(6.0f, -6.0f)
                lineToRelative(1.0f, 1.0f)
                lineToRelative(-7.0f, 7.0f)
                lineToRelative(-5.5f, -5.5f)
                close()
            }
        }
        .build()
        return _phoneMissedOutline!!
    }

private var _phoneMissedOutline: ImageVector? = null
