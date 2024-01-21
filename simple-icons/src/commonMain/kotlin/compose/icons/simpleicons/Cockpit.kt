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

public val SimpleIcons.Cockpit: ImageVector
    get() {
        if (_cockpit != null) {
            return _cockpit!!
        }
        _cockpit = Builder(name = "Cockpit", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 0.0f)
                curveTo(5.383f, 0.0f, 0.0f, 5.382f, 0.0f, 12.0f)
                reflectiveCurveToRelative(5.383f, 12.0f, 12.0f, 12.0f)
                reflectiveCurveToRelative(12.0f, -5.383f, 12.0f, -12.0f)
                reflectiveCurveTo(18.617f, 0.0f, 12.0f, 0.0f)
                close()
                moveTo(12.0f, 1.799f)
                arcTo(10.19f, 10.19f, 0.0f, false, true, 22.207f, 12.0f)
                arcTo(10.19f, 10.19f, 0.0f, false, true, 12.0f, 22.201f)
                arcTo(10.186f, 10.186f, 0.0f, false, true, 1.799f, 12.0f)
                arcTo(10.186f, 10.186f, 0.0f, false, true, 12.0f, 1.799f)
                close()
                moveTo(16.016f, 7.084f)
                curveToRelative(-0.49f, -0.018f, -1.232f, 0.368f, -1.899f, 1.031f)
                lineToRelative(-1.44f, 1.43f)
                lineToRelative(-4.31f, -1.447f)
                lineToRelative(-0.842f, 0.867f)
                lineToRelative(3.252f, 2.47f)
                lineToRelative(-0.728f, 0.723f)
                arcToRelative(4.747f, 4.747f, 0.0f, false, false, -0.639f, 0.787f)
                lineTo(7.451f, 12.8f)
                lineToRelative(-0.476f, 0.484f)
                lineToRelative(1.947f, 1.444f)
                lineToRelative(1.424f, 1.943f)
                lineToRelative(0.48f, -0.48f)
                lineToRelative(-0.144f, -1.98f)
                curveToRelative(0.246f, -0.16f, 0.497f, -0.361f, 0.74f, -0.603f)
                lineToRelative(0.765f, -0.76f)
                lineToRelative(2.495f, 3.274f)
                lineToRelative(0.869f, -0.84f)
                lineToRelative(-1.455f, -4.332f)
                lineToRelative(1.394f, -1.385f)
                curveToRelative(0.89f, -0.885f, 1.298f, -1.92f, 0.918f, -2.322f)
                arcToRelative(0.547f, 0.547f, 0.0f, false, false, -0.392f, -0.158f)
                close()
            }
        }
        .build()
        return _cockpit!!
    }

private var _cockpit: ImageVector? = null
