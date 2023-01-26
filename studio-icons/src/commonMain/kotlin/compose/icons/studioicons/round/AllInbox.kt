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

public val RoundGroup.AllInbox: ImageVector
    get() {
        if (_allInbox != null) {
            return _allInbox!!
        }
        _allInbox = Builder(name = "AllInbox", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 3.0f)
                lineTo(5.0f, 3.0f)
                curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f)
                verticalLineToRelative(7.0f)
                curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f)
                horizontalLineToRelative(14.0f)
                curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f)
                lineTo(21.0f, 5.0f)
                curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f)
                close()
                moveTo(19.0f, 9.0f)
                horizontalLineToRelative(-3.14f)
                curveToRelative(-0.47f, 0.0f, -0.84f, 0.33f, -0.97f, 0.78f)
                curveTo(14.53f, 11.04f, 13.35f, 12.0f, 12.0f, 12.0f)
                reflectiveCurveToRelative(-2.53f, -0.96f, -2.89f, -2.22f)
                curveToRelative(-0.13f, -0.45f, -0.5f, -0.78f, -0.97f, -0.78f)
                lineTo(5.0f, 9.0f)
                lineTo(5.0f, 6.0f)
                curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(12.0f)
                curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f)
                verticalLineToRelative(3.0f)
                close()
                moveTo(15.87f, 16.0f)
                lineTo(20.0f, 16.0f)
                curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f)
                verticalLineToRelative(2.0f)
                curveToRelative(0.0f, 1.1f, -0.9f, 2.0f, -2.0f, 2.0f)
                lineTo(5.0f, 21.0f)
                curveToRelative(-1.1f, 0.0f, -2.0f, -0.9f, -2.0f, -2.0f)
                verticalLineToRelative(-2.0f)
                curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(4.13f)
                curveToRelative(0.47f, 0.0f, 0.85f, 0.34f, 0.98f, 0.8f)
                curveToRelative(0.35f, 1.27f, 1.51f, 2.2f, 2.89f, 2.2f)
                reflectiveCurveToRelative(2.54f, -0.93f, 2.89f, -2.2f)
                curveToRelative(0.13f, -0.46f, 0.51f, -0.8f, 0.98f, -0.8f)
                close()
            }
        }
        .build()
        return _allInbox!!
    }

private var _allInbox: ImageVector? = null
