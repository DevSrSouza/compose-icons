package compose.icons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.SimpleIcons

public val SimpleIcons.Powers: ImageVector
    get() {
        if (_powers != null) {
            return _powers!!
        }
        _powers = Builder(name = "Powers", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.31f, 12.347f)
                reflectiveCurveToRelative(-0.008f, 0.73f, -0.008f, 1.068f)
                curveToRelative(0.0f, 0.34f, 0.339f, 0.544f, 0.777f, 0.544f)
                verticalLineToRelative(0.486f)
                horizontalLineToRelative(-2.988f)
                verticalLineToRelative(-0.486f)
                curveToRelative(0.408f, 0.0f, 0.79f, -0.204f, 0.79f, -0.544f)
                verticalLineToRelative(-2.673f)
                curveToRelative(0.0f, -0.545f, -0.52f, -0.557f, -0.79f, -0.595f)
                verticalLineToRelative(-0.466f)
                horizontalLineToRelative(2.55f)
                curveToRelative(1.042f, 0.0f, 2.403f, -0.125f, 2.403f, 1.228f)
                curveToRelative(0.0f, 1.403f, -1.233f, 1.441f, -2.304f, 1.441f)
                close()
                moveTo(12.293f, 10.135f)
                verticalLineToRelative(1.559f)
                horizontalLineToRelative(0.494f)
                curveToRelative(0.35f, 0.0f, 0.777f, -0.063f, 0.777f, -0.772f)
                curveToRelative(0.0f, -0.749f, -0.318f, -0.795f, -0.907f, -0.795f)
                curveToRelative(-0.254f, 0.0f, -0.364f, 0.008f, -0.364f, 0.008f)
                close()
                moveTo(12.0f, 4.551f)
                lineToRelative(12.0f, 7.45f)
                lineToRelative(-12.0f, 7.448f)
                lineTo(0.0f, 12.0f)
                close()
                moveTo(3.355f, 12.001f)
                curveToRelative(2.764f, 1.713f, 7.373f, 4.575f, 8.645f, 5.364f)
                lineTo(20.644f, 12.0f)
                arcTo(7141.71f, 7141.71f, 0.0f, false, false, 12.0f, 6.636f)
                curveToRelative(-1.272f, 0.787f, -5.881f, 3.649f, -8.645f, 5.365f)
                close()
            }
        }
        .build()
        return _powers!!
    }

private var _powers: ImageVector? = null
