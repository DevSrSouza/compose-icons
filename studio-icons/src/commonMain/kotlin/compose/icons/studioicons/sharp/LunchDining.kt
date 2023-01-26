package compose.icons.studioicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.SharpGroup

public val SharpGroup.LunchDining: ImageVector
    get() {
        if (_lunchDining != null) {
            return _lunchDining!!
        }
        _lunchDining = Builder(name = "LunchDining", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 16.0f)
                horizontalLineToRelative(20.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(-20.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.66f, 11.5f)
                curveToRelative(-1.95f, 0.0f, -2.09f, 1.0f, -3.33f, 1.0f)
                curveToRelative(-1.19f, 0.0f, -1.42f, -1.0f, -3.33f, -1.0f)
                curveToRelative(-1.95f, 0.0f, -2.09f, 1.0f, -3.33f, 1.0f)
                curveToRelative(-1.19f, 0.0f, -1.42f, -1.0f, -3.33f, -1.0f)
                curveToRelative(-1.95f, 0.0f, -2.09f, 1.0f, -3.33f, 1.0f)
                verticalLineToRelative(2.0f)
                curveToRelative(1.9f, 0.0f, 2.17f, -1.0f, 3.35f, -1.0f)
                curveToRelative(1.19f, 0.0f, 1.42f, 1.0f, 3.33f, 1.0f)
                curveToRelative(1.95f, 0.0f, 2.09f, -1.0f, 3.33f, -1.0f)
                curveToRelative(1.19f, 0.0f, 1.42f, 1.0f, 3.33f, 1.0f)
                curveToRelative(1.95f, 0.0f, 2.09f, -1.0f, 3.33f, -1.0f)
                curveToRelative(1.19f, 0.0f, 1.4f, 0.98f, 3.32f, 1.0f)
                lineToRelative(-0.01f, -1.98f)
                curveTo(20.38f, 12.19f, 20.37f, 11.5f, 18.66f, 11.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 9.0f)
                curveToRelative(0.02f, -4.0f, -4.28f, -6.0f, -10.0f, -6.0f)
                curveTo(6.29f, 3.0f, 2.0f, 5.0f, 2.0f, 9.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(20.0f)
                lineTo(22.0f, 9.0f)
                lineTo(22.0f, 9.0f)
                close()
            }
        }
        .build()
        return _lunchDining!!
    }

private var _lunchDining: ImageVector? = null
