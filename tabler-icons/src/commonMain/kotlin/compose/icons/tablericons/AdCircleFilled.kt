package compose.icons.tablericons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.TablerIcons

public val TablerIcons.AdCircleFilled: ImageVector
    get() {
        if (_adCircleFilled != null) {
            return _adCircleFilled!!
        }
        _adCircleFilled = Builder(name = "AdCircleFilled", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Round, strokeLineJoin = StrokeJoin.Companion.Round,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                curveToRelative(5.523f, 0.0f, 10.0f, 4.477f, 10.0f, 10.0f)
                reflectiveCurveToRelative(-4.477f, 10.0f, -10.0f, 10.0f)
                curveToRelative(-5.43f, 0.0f, -9.848f, -4.327f, -9.996f, -9.72f)
                lineToRelative(-0.004f, -0.28f)
                lineToRelative(0.004f, -0.28f)
                curveToRelative(0.148f, -5.393f, 4.566f, -9.72f, 9.996f, -9.72f)
                close()
                moveTo(8.5f, 8.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, -2.495f, 2.336f)
                lineToRelative(-0.005f, 0.164f)
                verticalLineToRelative(4.5f)
                lineToRelative(0.007f, 0.117f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.986f, 0.0f)
                lineToRelative(0.007f, -0.117f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(1.0f)
                lineToRelative(0.007f, 0.117f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.986f, 0.0f)
                lineToRelative(0.007f, -0.117f)
                verticalLineToRelative(-4.5f)
                lineToRelative(-0.005f, -0.164f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, -2.495f, -2.336f)
                close()
                moveTo(15.0f, 8.0f)
                horizontalLineToRelative(-1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, 1.0f)
                verticalLineToRelative(6.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, 1.0f)
                horizontalLineToRelative(1.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 3.0f, -3.0f)
                verticalLineToRelative(-2.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -3.0f, -3.0f)
                close()
                moveTo(15.0f, 10.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, 1.0f)
                verticalLineToRelative(2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.883f, 0.993f)
                lineToRelative(-0.117f, 0.007f)
                verticalLineToRelative(-4.0f)
                close()
                moveTo(8.5f, 10.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.492f, 0.41f)
                lineToRelative(0.008f, 0.09f)
                verticalLineToRelative(1.5f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-1.5f)
                lineToRelative(0.008f, -0.09f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.492f, -0.41f)
                close()
            }
        }
        .build()
        return _adCircleFilled!!
    }

private var _adCircleFilled: ImageVector? = null
