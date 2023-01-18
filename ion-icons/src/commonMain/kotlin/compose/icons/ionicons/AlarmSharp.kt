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

public val IonIcons.AlarmSharp: ImageVector
    get() {
        if (_alarmSharp != null) {
            return _alarmSharp!!
        }
        _alarmSharp = Builder(name = "AlarmSharp", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(403.79f, 64.11f)
                lineToRelative(-3.27f, -0.1f)
                horizontalLineTo(400.0f)
                curveToRelative(-14.73f, 0.0f, -28.55f, 5.91f, -40.52f, 15.0f)
                reflectiveCurveTo(344.0f, 96.0f, 344.0f, 96.0f)
                lineToRelative(88.0f, 86.0f)
                reflectiveCurveToRelative(11.25f, -5.71f, 17.61f, -13.85f)
                reflectiveCurveToRelative(14.28f, -18.08f, 14.32f, -37.11f)
                curveTo(464.0f, 95.55f, 437.6f, 66.15f, 403.79f, 64.11f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(108.21f, 64.11f)
                lineToRelative(3.27f, -0.1f)
                horizontalLineTo(112.0f)
                curveToRelative(14.73f, 0.0f, 28.55f, 5.91f, 40.52f, 15.0f)
                reflectiveCurveTo(168.0f, 96.0f, 168.0f, 96.0f)
                lineTo(80.0f, 182.0f)
                reflectiveCurveToRelative(-11.25f, -5.71f, -17.61f, -13.85f)
                reflectiveCurveTo(48.11f, 150.07f, 48.07f, 131.0f)
                curveTo(48.0f, 95.55f, 74.4f, 66.15f, 108.21f, 64.11f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(391.3f, 384.6f)
                arcToRelative(0.06f, 0.06f, 0.0f, false, true, 0.0f, -0.08f)
                curveTo(425.0f, 344.0f, 441.0f, 288.24f, 427.0f, 229.23f)
                curveToRelative(-13.64f, -57.52f, -72.67f, -115.69f, -130.34f, -128.66f)
                curveTo(182.0f, 74.79f, 80.07f, 161.71f, 80.07f, 272.0f)
                arcToRelative(175.15f, 175.15f, 0.0f, false, false, 40.78f, 112.52f)
                arcToRelative(0.06f, 0.06f, 0.0f, false, true, 0.0f, 0.08f)
                lineTo(73.0f, 432.0f)
                arcToRelative(0.06f, 0.06f, 0.0f, false, false, 0.0f, 0.08f)
                lineTo(96.0f, 454.59f)
                arcToRelative(0.06f, 0.06f, 0.0f, false, false, 0.08f, 0.0f)
                lineToRelative(47.43f, -47.37f)
                arcToRelative(0.06f, 0.06f, 0.0f, false, true, 0.08f, 0.0f)
                arcToRelative(175.64f, 175.64f, 0.0f, false, false, 225.05f, 0.0f)
                arcToRelative(0.0f, 0.0f, 0.0f, false, true, 0.07f, 0.0f)
                lineTo(416.0f, 454.59f)
                arcToRelative(0.06f, 0.06f, 0.0f, false, false, 0.08f, 0.0f)
                lineTo(440.0f, 432.0f)
                close()
                moveTo(272.07f, 288.0f)
                horizontalLineToRelative(-112.0f)
                arcTo(0.0f, 0.0f, 0.0f, false, true, 160.0f, 288.0f)
                verticalLineToRelative(-31.9f)
                arcToRelative(0.0f, 0.0f, 0.0f, false, true, 0.05f, -0.05f)
                horizontalLineToRelative(80.0f)
                arcToRelative(0.0f, 0.0f, 0.0f, false, false, 0.0f, -0.05f)
                verticalLineTo(144.0f)
                horizontalLineToRelative(32.0f)
                close()
            }
        }
        .build()
        return _alarmSharp!!
    }

private var _alarmSharp: ImageVector? = null
