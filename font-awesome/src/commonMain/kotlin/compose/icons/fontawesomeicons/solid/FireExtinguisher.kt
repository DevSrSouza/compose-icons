package compose.icons.fontawesomeicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.SolidGroup

public val SolidGroup.FireExtinguisher: ImageVector
    get() {
        if (_fireExtinguisher != null) {
            return _fireExtinguisher!!
        }
        _fireExtinguisher = Builder(name = "FireExtinguisher", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(500.3f, 7.3f)
                curveTo(507.7f, 13.3f, 512.0f, 22.4f, 512.0f, 32.0f)
                verticalLineToRelative(96.0f)
                curveToRelative(0.0f, 9.6f, -4.3f, 18.7f, -11.7f, 24.7f)
                reflectiveCurveToRelative(-17.2f, 8.5f, -26.6f, 6.6f)
                lineToRelative(-160.0f, -32.0f)
                curveTo(301.5f, 124.9f, 292.0f, 115.7f, 289.0f, 104.0f)
                horizontalLineTo(224.0f)
                verticalLineToRelative(34.8f)
                curveToRelative(37.8f, 18.0f, 64.0f, 56.5f, 64.0f, 101.2f)
                verticalLineTo(384.0f)
                horizontalLineTo(64.0f)
                verticalLineTo(240.0f)
                curveToRelative(0.0f, -44.7f, 26.2f, -83.2f, 64.0f, -101.2f)
                verticalLineTo(110.0f)
                curveToRelative(-36.2f, 11.1f, -66.0f, 36.9f, -82.3f, 70.5f)
                curveToRelative(-5.8f, 11.9f, -20.2f, 16.9f, -32.1f, 11.1f)
                reflectiveCurveTo(-3.3f, 171.4f, 2.5f, 159.5f)
                curveTo(26.7f, 109.8f, 72.7f, 72.6f, 128.0f, 60.4f)
                verticalLineTo(32.0f)
                curveToRelative(0.0f, -17.7f, 14.3f, -32.0f, 32.0f, -32.0f)
                horizontalLineToRelative(32.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, 14.3f, 32.0f, 32.0f)
                verticalLineTo(56.0f)
                horizontalLineToRelative(65.0f)
                curveToRelative(3.0f, -11.7f, 12.5f, -20.9f, 24.7f, -23.4f)
                lineToRelative(160.0f, -32.0f)
                curveToRelative(9.4f, -1.9f, 19.1f, 0.6f, 26.6f, 6.6f)
                close()
                moveTo(288.0f, 416.0f)
                verticalLineToRelative(32.0f)
                curveToRelative(0.0f, 35.3f, -28.7f, 64.0f, -64.0f, 64.0f)
                horizontalLineTo(128.0f)
                curveToRelative(-35.3f, 0.0f, -64.0f, -28.7f, -64.0f, -64.0f)
                verticalLineTo(416.0f)
                horizontalLineTo(288.0f)
                close()
                moveTo(176.0f, 96.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, false, 0.0f, -32.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, false, 0.0f, 32.0f)
                close()
            }
        }
        .build()
        return _fireExtinguisher!!
    }

private var _fireExtinguisher: ImageVector? = null
