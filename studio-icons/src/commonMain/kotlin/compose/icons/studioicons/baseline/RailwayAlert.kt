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

public val BaselineGroup.RailwayAlert: ImageVector
    get() {
        if (_railwayAlert != null) {
            return _railwayAlert!!
        }
        _railwayAlert = Builder(name = "RailwayAlert", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.0f, 8.0f)
                arcToRelative(7.0f, 7.0f, 0.0f, false, false, -11.95f, -4.95f)
                arcTo(33.8f, 33.8f, 0.0f, false, false, 9.0f, 3.0f)
                curveToRelative(-4.42f, 0.0f, -8.0f, 0.5f, -8.0f, 4.0f)
                verticalLineToRelative(10.5f)
                arcTo(3.5f, 3.5f, 0.0f, false, false, 4.5f, 21.0f)
                lineTo(3.0f, 22.5f)
                verticalLineToRelative(0.5f)
                horizontalLineToRelative(12.0f)
                verticalLineToRelative(-0.5f)
                lineTo(13.5f, 21.0f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, 3.5f, -3.5f)
                verticalLineToRelative(-2.58f)
                arcTo(7.0f, 7.0f, 0.0f, false, false, 23.0f, 8.0f)
                close()
                moveTo(3.0f, 12.0f)
                lineTo(3.0f, 7.0f)
                horizontalLineToRelative(6.08f)
                arcToRelative(6.96f, 6.96f, 0.0f, false, false, 1.18f, 5.0f)
                lineTo(3.0f, 12.0f)
                close()
                moveTo(9.0f, 19.0f)
                curveToRelative(-1.1f, 0.0f, -2.0f, -0.9f, -2.0f, -2.0f)
                reflectiveCurveToRelative(0.9f, -2.0f, 2.0f, -2.0f)
                reflectiveCurveToRelative(2.0f, 0.9f, 2.0f, 2.0f)
                reflectiveCurveToRelative(-0.9f, 2.0f, -2.0f, 2.0f)
                close()
                moveTo(16.71f, 12.94f)
                lineToRelative(-0.2f, 0.03f)
                lineTo(16.0f, 13.0f)
                lineToRelative(-0.47f, -0.02f)
                lineToRelative(-0.16f, -0.02f)
                lineToRelative(-0.29f, -0.04f)
                lineToRelative(-0.2f, -0.04f)
                lineToRelative(-0.22f, -0.06f)
                arcToRelative(1.55f, 1.55f, 0.0f, false, true, -0.23f, -0.07f)
                lineToRelative(-0.13f, -0.05f)
                arcTo(4.99f, 4.99f, 0.0f, false, true, 11.1f, 7.0f)
                curveToRelative(0.04f, -0.19f, 0.09f, -0.37f, 0.15f, -0.54f)
                lineToRelative(0.05f, -0.14f)
                lineToRelative(0.15f, -0.38f)
                lineToRelative(0.07f, -0.15f)
                lineToRelative(0.2f, -0.36f)
                lineToRelative(0.07f, -0.12f)
                lineToRelative(0.3f, -0.42f)
                lineToRelative(0.02f, -0.02f)
                curveToRelative(0.24f, -0.3f, 0.52f, -0.57f, 0.82f, -0.81f)
                lineToRelative(0.01f, -0.01f)
                lineToRelative(0.46f, -0.32f)
                lineToRelative(0.03f, -0.02f)
                arcTo(5.25f, 5.25f, 0.0f, false, true, 16.0f, 3.0f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, true, 0.71f, 9.94f)
                close()
                moveTo(15.0f, 4.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(-2.0f)
                close()
                moveTo(15.0f, 10.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-2.0f)
                close()
            }
        }
        .build()
        return _railwayAlert!!
    }

private var _railwayAlert: ImageVector? = null
