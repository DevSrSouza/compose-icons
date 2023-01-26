package compose.icons.studioicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.OutlineGroup

public val OutlineGroup.Directions: ImageVector
    get() {
        if (_directions != null) {
            return _directions!!
        }
        _directions = Builder(name = "Directions", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.43f, 10.59f)
                lineToRelative(-9.01f, -9.01f)
                curveToRelative(-0.75f, -0.75f, -2.07f, -0.76f, -2.83f, 0.0f)
                lineToRelative(-9.0f, 9.0f)
                curveToRelative(-0.78f, 0.78f, -0.78f, 2.04f, 0.0f, 2.82f)
                lineToRelative(9.0f, 9.0f)
                curveToRelative(0.39f, 0.39f, 0.9f, 0.58f, 1.41f, 0.58f)
                curveToRelative(0.51f, 0.0f, 1.02f, -0.19f, 1.41f, -0.58f)
                lineToRelative(8.99f, -8.99f)
                curveToRelative(0.79f, -0.76f, 0.8f, -2.02f, 0.03f, -2.82f)
                close()
                moveTo(12.01f, 20.99f)
                lineToRelative(-9.0f, -9.0f)
                lineToRelative(9.0f, -9.0f)
                lineToRelative(9.0f, 9.0f)
                lineToRelative(-9.0f, 9.0f)
                close()
                moveTo(8.0f, 11.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(2.5f)
                lineToRelative(3.5f, -3.5f)
                lineTo(14.0f, 7.5f)
                lineTo(14.0f, 10.0f)
                lineTo(9.0f, 10.0f)
                curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f)
                close()
            }
        }
        .build()
        return _directions!!
    }

private var _directions: ImageVector? = null
