package compose.icons.studioicons.baseline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.BaselineGroup

public val BaselineGroup.PestControlRodent: ImageVector
    get() {
        if (_pestControlRodent != null) {
            return _pestControlRodent!!
        }
        _pestControlRodent = Builder(name = "PestControlRodent", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.31f, 17.38f)
                lineToRelative(-2.39f, -2.13f)
                curveTo(19.44f, 12.89f, 17.56f, 11.0f, 15.5f, 11.0f)
                curveToRelative(-1.16f, 0.0f, -3.5f, 0.9f, -3.5f, 3.5f)
                curveToRelative(0.0f, 0.97f, 0.39f, 1.84f, 1.03f, 2.47f)
                lineToRelative(-0.71f, 0.71f)
                curveTo(11.5f, 16.87f, 11.0f, 15.74f, 11.0f, 14.5f)
                curveToRelative(0.0f, -1.7f, 0.96f, -3.17f, 2.35f, -3.93f)
                curveToRelative(-0.7f, -0.36f, -1.48f, -0.57f, -2.28f, -0.57f)
                curveToRelative(-2.38f, 0.0f, -4.37f, 1.65f, -4.91f, 3.87f)
                curveTo(4.91f, 13.5f, 4.0f, 12.36f, 4.0f, 11.0f)
                curveToRelative(0.0f, -1.66f, 1.34f, -3.0f, 3.0f, -3.0f)
                curveToRelative(0.94f, 0.0f, 1.56f, 0.0f, 2.5f, 0.0f)
                curveTo(10.88f, 8.0f, 12.0f, 6.88f, 12.0f, 5.5f)
                curveTo(12.0f, 4.12f, 10.88f, 3.0f, 9.5f, 3.0f)
                horizontalLineTo(8.0f)
                curveTo(7.45f, 3.0f, 7.0f, 3.45f, 7.0f, 4.0f)
                curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(1.5f)
                curveTo(9.78f, 5.0f, 10.0f, 5.22f, 10.0f, 5.5f)
                curveTo(10.0f, 5.78f, 9.78f, 6.0f, 9.5f, 6.0f)
                curveTo(9.47f, 6.0f, 9.0f, 6.0f, 7.0f, 6.0f)
                curveToRelative(-2.76f, 0.0f, -5.0f, 2.24f, -5.0f, 5.0f)
                curveToRelative(0.0f, 2.42f, 1.72f, 4.44f, 4.0f, 4.9f)
                verticalLineToRelative(0.03f)
                curveTo(6.0f, 18.73f, 8.27f, 21.0f, 11.07f, 21.0f)
                horizontalLineToRelative(8.86f)
                curveTo(21.8f, 21.0f, 22.74f, 18.66f, 21.31f, 17.38f)
                close()
                moveTo(18.0f, 19.0f)
                curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f)
                curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f)
                reflectiveCurveToRelative(1.0f, 0.45f, 1.0f, 1.0f)
                curveTo(19.0f, 18.55f, 18.55f, 19.0f, 18.0f, 19.0f)
                close()
            }
        }
        .build()
        return _pestControlRodent!!
    }

private var _pestControlRodent: ImageVector? = null
