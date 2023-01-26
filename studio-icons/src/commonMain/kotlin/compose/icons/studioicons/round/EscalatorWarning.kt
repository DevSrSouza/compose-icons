package compose.icons.studioicons.round

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.RoundGroup

public val RoundGroup.EscalatorWarning: ImageVector
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
                moveTo(18.5f, 12.0f)
                horizontalLineToRelative(-2.84f)
                curveToRelative(-0.58f, 0.01f, -1.14f, 0.32f, -1.45f, 0.86f)
                lineToRelative(-0.92f, 1.32f)
                lineTo(9.72f, 8.0f)
                curveTo(9.35f, 7.37f, 8.69f, 7.01f, 8.01f, 7.0f)
                horizontalLineTo(5.0f)
                curveTo(3.9f, 7.0f, 3.0f, 7.9f, 3.0f, 9.0f)
                verticalLineToRelative(5.0f)
                curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(0.5f)
                verticalLineToRelative(6.0f)
                curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(3.0f)
                curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f)
                verticalLineToRelative(-9.39f)
                lineToRelative(2.24f, 3.89f)
                curveToRelative(0.18f, 0.31f, 0.51f, 0.5f, 0.87f, 0.5f)
                horizontalLineToRelative(1.1f)
                curveToRelative(0.33f, 0.0f, 0.63f, -0.16f, 0.82f, -0.43f)
                lineTo(15.0f, 14.9f)
                verticalLineTo(21.0f)
                curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(2.0f)
                curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(0.0f)
                curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f)
                verticalLineToRelative(-2.5f)
                curveTo(20.0f, 12.68f, 19.33f, 12.0f, 18.5f, 12.0f)
                close()
            }
        }
        .build()
        return _escalatorWarning!!
    }

private var _escalatorWarning: ImageVector? = null
