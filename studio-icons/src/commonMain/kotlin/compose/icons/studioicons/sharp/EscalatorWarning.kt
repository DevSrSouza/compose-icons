package compose.icons.studioicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.SharpGroup

public val SharpGroup.EscalatorWarning: ImageVector
    get() {
        if (_escalatorWarning != null) {
            return _escalatorWarning!!
        }
        _escalatorWarning = Builder(name = "EscalatorWarning", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.5f, 2.0f)
                curveToRelative(1.1f, 0.0f, 2.0f, 0.9f, 2.0f, 2.0f)
                reflectiveCurveToRelative(-0.9f, 2.0f, -2.0f, 2.0f)
                reflectiveCurveToRelative(-2.0f, -0.9f, -2.0f, -2.0f)
                reflectiveCurveTo(5.4f, 2.0f, 6.5f, 2.0f)
                close()
                moveTo(15.5f, 9.5f)
                curveToRelative(0.0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                reflectiveCurveTo(17.83f, 8.0f, 17.0f, 8.0f)
                reflectiveCurveTo(15.5f, 8.67f, 15.5f, 9.5f)
                close()
                moveTo(14.21f, 12.86f)
                lineToRelative(-0.92f, 1.32f)
                lineTo(9.72f, 8.0f)
                curveTo(9.37f, 7.38f, 8.71f, 7.0f, 7.99f, 7.0f)
                horizontalLineTo(3.0f)
                verticalLineToRelative(8.0f)
                horizontalLineToRelative(1.5f)
                verticalLineToRelative(7.0f)
                horizontalLineToRelative(5.0f)
                verticalLineTo(11.61f)
                lineTo(12.03f, 16.0f)
                horizontalLineToRelative(2.2f)
                lineTo(15.0f, 14.9f)
                verticalLineTo(22.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(-5.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(-5.0f)
                horizontalLineToRelative(-4.15f)
                curveTo(15.19f, 12.0f, 14.58f, 12.32f, 14.21f, 12.86f)
                close()
            }
        }
        .build()
        return _escalatorWarning!!
    }

private var _escalatorWarning: ImageVector? = null
