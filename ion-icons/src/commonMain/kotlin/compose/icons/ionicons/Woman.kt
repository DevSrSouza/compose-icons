package compose.icons.ionicons

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
import compose.icons.IonIcons

public val IonIcons.Woman: ImageVector
    get() {
        if (_woman != null) {
            return _woman!!
        }
        _woman = Builder(name = "Woman", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(255.75f, 56.0f)
                moveToRelative(-56.0f, 0.0f)
                arcToRelative(56.0f, 56.0f, 0.0f, true, true, 112.0f, 0.0f)
                arcToRelative(56.0f, 56.0f, 0.0f, true, true, -112.0f, 0.0f)
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(394.63f, 277.9f)
                lineTo(384.3f, 243.49f)
                reflectiveCurveToRelative(0.0f, -0.07f, 0.0f, -0.11f)
                lineToRelative(-22.46f, -74.86f)
                horizontalLineToRelative(-0.05f)
                lineToRelative(-2.51f, -8.45f)
                arcToRelative(44.87f, 44.87f, 0.0f, false, false, -43.0f, -32.08f)
                horizontalLineToRelative(-120.0f)
                arcToRelative(44.84f, 44.84f, 0.0f, false, false, -43.0f, 32.08f)
                lineToRelative(-2.51f, 8.45f)
                horizontalLineToRelative(-0.06f)
                lineToRelative(-22.46f, 74.86f)
                reflectiveCurveToRelative(0.0f, 0.07f, 0.0f, 0.11f)
                lineTo(117.88f, 277.9f)
                curveToRelative(-3.12f, 10.39f, 2.3f, 21.66f, 12.57f, 25.14f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 25.6f, -13.18f)
                lineToRelative(25.58f, -85.25f)
                horizontalLineToRelative(0.0f)
                lineToRelative(2.17f, -7.23f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 199.33f, 200.0f)
                arcToRelative(7.78f, 7.78f, 0.0f, false, true, -0.17f, 1.61f)
                verticalLineToRelative(0.0f)
                lineTo(155.43f, 347.4f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 170.75f, 368.0f)
                horizontalLineToRelative(29.0f)
                verticalLineTo(482.69f)
                curveToRelative(0.0f, 16.46f, 10.53f, 29.31f, 24.0f, 29.31f)
                reflectiveCurveToRelative(24.0f, -12.85f, 24.0f, -29.31f)
                verticalLineTo(368.0f)
                horizontalLineToRelative(16.0f)
                verticalLineTo(482.69f)
                curveToRelative(0.0f, 16.46f, 10.53f, 29.31f, 24.0f, 29.31f)
                reflectiveCurveToRelative(24.0f, -12.85f, 24.0f, -29.31f)
                verticalLineTo(368.0f)
                horizontalLineToRelative(30.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 15.33f, -20.6f)
                lineTo(313.34f, 201.59f)
                arcToRelative(7.52f, 7.52f, 0.0f, false, true, -0.16f, -1.59f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 15.54f, -2.63f)
                lineToRelative(2.17f, 7.23f)
                horizontalLineToRelative(0.0f)
                lineToRelative(25.57f, 85.25f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 382.05f, 303.0f)
                curveTo(392.32f, 299.56f, 397.74f, 288.29f, 394.63f, 277.9f)
                close()
            }
        }
        .build()
        return _woman!!
    }

private var _woman: ImageVector? = null
