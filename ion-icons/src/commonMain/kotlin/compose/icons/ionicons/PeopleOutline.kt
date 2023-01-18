package compose.icons.ionicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.IonIcons

public val IonIcons.PeopleOutline: ImageVector
    get() {
        if (_peopleOutline != null) {
            return _peopleOutline!!
        }
        _peopleOutline = Builder(name = "PeopleOutline", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(402.0f, 168.0f)
                curveToRelative(-2.93f, 40.67f, -33.1f, 72.0f, -66.0f, 72.0f)
                reflectiveCurveToRelative(-63.12f, -31.32f, -66.0f, -72.0f)
                curveToRelative(-3.0f, -42.31f, 26.37f, -72.0f, 66.0f, -72.0f)
                reflectiveCurveTo(405.0f, 126.46f, 402.0f, 168.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(336.0f, 304.0f)
                curveToRelative(-65.17f, 0.0f, -127.84f, 32.37f, -143.54f, 95.41f)
                curveToRelative(-2.08f, 8.34f, 3.15f, 16.59f, 11.72f, 16.59f)
                horizontalLineTo(467.83f)
                curveToRelative(8.57f, 0.0f, 13.77f, -8.25f, 11.72f, -16.59f)
                curveTo(463.85f, 335.36f, 401.18f, 304.0f, 336.0f, 304.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(200.0f, 185.94f)
                curveTo(197.66f, 218.42f, 173.28f, 244.0f, 147.0f, 244.0f)
                reflectiveCurveTo(96.3f, 218.43f, 94.0f, 185.94f)
                curveTo(91.61f, 152.15f, 115.34f, 128.0f, 147.0f, 128.0f)
                reflectiveCurveTo(202.39f, 152.77f, 200.0f, 185.94f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(206.0f, 306.0f)
                curveToRelative(-18.05f, -8.27f, -37.93f, -11.45f, -59.0f, -11.45f)
                curveToRelative(-52.0f, 0.0f, -102.1f, 25.85f, -114.65f, 76.2f)
                curveTo(30.7f, 377.41f, 34.88f, 384.0f, 41.72f, 384.0f)
                horizontalLineTo(154.0f)
            }
        }
        .build()
        return _peopleOutline!!
    }

private var _peopleOutline: ImageVector? = null
