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

public val BaselineGroup.ViewInAr: ImageVector
    get() {
        if (_viewInAr != null) {
            return _viewInAr!!
        }
        _viewInAr = Builder(name = "ViewInAr", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.25f, 7.6f)
                lineToRelative(-5.5f, -3.18f)
                curveToRelative(-0.46f, -0.27f, -1.04f, -0.27f, -1.5f, 0.0f)
                lineTo(5.75f, 7.6f)
                curveToRelative(-0.46f, 0.27f, -0.75f, 0.76f, -0.75f, 1.3f)
                verticalLineToRelative(6.35f)
                curveToRelative(0.0f, 0.54f, 0.29f, 1.03f, 0.75f, 1.3f)
                lineToRelative(5.5f, 3.18f)
                curveToRelative(0.46f, 0.27f, 1.04f, 0.27f, 1.5f, 0.0f)
                lineToRelative(5.5f, -3.18f)
                curveToRelative(0.46f, -0.27f, 0.75f, -0.76f, 0.75f, -1.3f)
                lineTo(19.0f, 8.9f)
                curveToRelative(0.0f, -0.54f, -0.29f, -1.03f, -0.75f, -1.3f)
                close()
                moveTo(7.0f, 14.96f)
                verticalLineToRelative(-4.62f)
                lineToRelative(4.0f, 2.32f)
                verticalLineToRelative(4.61f)
                lineToRelative(-4.0f, -2.31f)
                close()
                moveTo(12.0f, 10.93f)
                lineTo(8.0f, 8.61f)
                lineToRelative(4.0f, -2.31f)
                lineToRelative(4.0f, 2.31f)
                lineToRelative(-4.0f, 2.32f)
                close()
                moveTo(13.0f, 17.27f)
                verticalLineToRelative(-4.61f)
                lineToRelative(4.0f, -2.32f)
                verticalLineToRelative(4.62f)
                lineToRelative(-4.0f, 2.31f)
                close()
                moveTo(7.0f, 2.0f)
                lineTo(3.5f, 2.0f)
                curveTo(2.67f, 2.0f, 2.0f, 2.67f, 2.0f, 3.5f)
                lineTo(2.0f, 7.0f)
                horizontalLineToRelative(2.0f)
                lineTo(4.0f, 4.0f)
                horizontalLineToRelative(3.0f)
                lineTo(7.0f, 2.0f)
                close()
                moveTo(17.0f, 2.0f)
                horizontalLineToRelative(3.5f)
                curveToRelative(0.83f, 0.0f, 1.5f, 0.67f, 1.5f, 1.5f)
                lineTo(22.0f, 7.0f)
                horizontalLineToRelative(-2.0f)
                lineTo(20.0f, 4.0f)
                horizontalLineToRelative(-3.0f)
                lineTo(17.0f, 2.0f)
                close()
                moveTo(7.0f, 22.0f)
                lineTo(3.5f, 22.0f)
                curveToRelative(-0.83f, 0.0f, -1.5f, -0.67f, -1.5f, -1.5f)
                lineTo(2.0f, 17.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(17.0f, 22.0f)
                horizontalLineToRelative(3.5f)
                curveToRelative(0.83f, 0.0f, 1.5f, -0.67f, 1.5f, -1.5f)
                lineTo(22.0f, 17.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(2.0f)
                close()
            }
        }
        .build()
        return _viewInAr!!
    }

private var _viewInAr: ImageVector? = null
