package compose.icons.ionicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.IonIcons

public val IonIcons.HandLeft: ImageVector
    get() {
        if (_handLeft != null) {
            return _handLeft!!
        }
        _handLeft = Builder(name = "HandLeft", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(432.8f, 211.44f)
                horizontalLineToRelative(0.0f)
                curveToRelative(-15.52f, -8.82f, -34.91f, -2.28f, -43.31f, 13.68f)
                lineToRelative(-41.38f, 84.41f)
                arcToRelative(7.0f, 7.0f, 0.0f, false, true, -8.93f, 3.43f)
                horizontalLineToRelative(0.0f)
                arcToRelative(7.0f, 7.0f, 0.0f, false, true, -4.41f, -6.52f)
                verticalLineTo(72.0f)
                curveToRelative(0.0f, -13.91f, -12.85f, -24.0f, -26.77f, -24.0f)
                reflectiveCurveToRelative(-26.0f, 10.09f, -26.0f, 24.0f)
                verticalLineTo(228.64f)
                arcTo(11.24f, 11.24f, 0.0f, false, true, 271.21f, 240.0f)
                arcTo(11.0f, 11.0f, 0.0f, false, true, 260.0f, 229.0f)
                verticalLineTo(24.0f)
                curveToRelative(0.0f, -13.91f, -10.94f, -24.0f, -24.86f, -24.0f)
                reflectiveCurveTo(210.0f, 10.09f, 210.0f, 24.0f)
                verticalLineTo(228.64f)
                arcTo(11.24f, 11.24f, 0.0f, false, true, 199.21f, 240.0f)
                arcTo(11.0f, 11.0f, 0.0f, false, true, 188.0f, 229.0f)
                verticalLineTo(56.0f)
                curveToRelative(0.0f, -13.91f, -12.08f, -24.0f, -26.0f, -24.0f)
                reflectiveCurveToRelative(-26.0f, 11.09f, -26.0f, 25.0f)
                verticalLineTo(244.64f)
                arcTo(11.24f, 11.24f, 0.0f, false, true, 125.21f, 256.0f)
                arcTo(11.0f, 11.0f, 0.0f, false, true, 114.0f, 245.0f)
                verticalLineTo(120.0f)
                curveToRelative(0.0f, -13.91f, -11.08f, -24.0f, -25.0f, -24.0f)
                reflectiveCurveToRelative(-25.12f, 10.22f, -25.0f, 24.0f)
                verticalLineTo(336.0f)
                curveToRelative(0.0f, 117.41f, 72.0f, 176.0f, 160.0f, 176.0f)
                horizontalLineToRelative(16.0f)
                curveToRelative(88.0f, 0.0f, 115.71f, -39.6f, 136.0f, -88.0f)
                lineToRelative(68.71f, -169.0f)
                curveTo(451.33f, 237.0f, 448.31f, 220.25f, 432.8f, 211.44f)
                close()
            }
        }
        .build()
        return _handLeft!!
    }

private var _handLeft: ImageVector? = null
