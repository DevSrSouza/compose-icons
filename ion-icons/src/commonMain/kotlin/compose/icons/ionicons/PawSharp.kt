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

public val IonIcons.PawSharp: ImageVector
    get() {
        if (_pawSharp != null) {
            return _pawSharp!!
        }
        _pawSharp = Builder(name = "PawSharp", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(442.8f, 361.82f)
                curveTo(434.0f, 336.72f, 413.49f, 324.0f, 393.69f, 311.7f)
                curveToRelative(-17.23f, -10.71f, -33.5f, -20.83f, -44.14f, -39.0f)
                curveTo(320.22f, 222.37f, 304.11f, 192.0f, 256.06f, 192.0f)
                reflectiveCurveToRelative(-64.21f, 30.38f, -93.61f, 80.69f)
                curveToRelative(-10.65f, 18.21f, -27.0f, 28.35f, -44.25f, 39.08f)
                curveToRelative(-19.8f, 12.31f, -40.27f, 25.0f, -49.1f, 50.05f)
                arcTo(78.06f, 78.06f, 0.0f, false, false, 64.0f, 390.11f)
                curveTo(64.0f, 430.85f, 96.45f, 464.0f, 132.4f, 464.0f)
                reflectiveCurveToRelative(83.31f, -18.13f, 123.76f, -18.13f)
                reflectiveCurveTo(343.31f, 464.0f, 379.71f, 464.0f)
                reflectiveCurveTo(448.0f, 430.85f, 448.0f, 390.11f)
                arcTo(78.3f, 78.3f, 0.0f, false, false, 442.8f, 361.82f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 216.0f)
                arcToRelative(56.0f, 72.0f, 0.0f, true, false, 112.0f, 0.0f)
                arcToRelative(56.0f, 72.0f, 0.0f, true, false, -112.0f, 0.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 120.0f)
                arcToRelative(56.0f, 72.0f, 0.0f, true, false, 112.0f, 0.0f)
                arcToRelative(56.0f, 72.0f, 0.0f, true, false, -112.0f, 0.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(272.0f, 120.0f)
                arcToRelative(56.0f, 72.0f, 0.0f, true, false, 112.0f, 0.0f)
                arcToRelative(56.0f, 72.0f, 0.0f, true, false, -112.0f, 0.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(384.0f, 216.0f)
                arcToRelative(56.0f, 72.0f, 0.0f, true, false, 112.0f, 0.0f)
                arcToRelative(56.0f, 72.0f, 0.0f, true, false, -112.0f, 0.0f)
                close()
            }
        }
        .build()
        return _pawSharp!!
    }

private var _pawSharp: ImageVector? = null
