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

public val IonIcons.Male: ImageVector
    get() {
        if (_male != null) {
            return _male!!
        }
        _male = Builder(name = "Male", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(442.0f, 48.0f)
                horizontalLineTo(352.0f)
                arcToRelative(22.0f, 22.0f, 0.0f, false, false, 0.0f, 44.0f)
                horizontalLineToRelative(36.89f)
                lineTo(328.5f, 152.39f)
                curveToRelative(-68.19f, -52.86f, -167.0f, -48.0f, -229.54f, 14.57f)
                horizontalLineToRelative(0.0f)
                curveTo(31.12f, 234.81f, 31.12f, 345.19f, 99.0f, 413.0f)
                arcTo(174.21f, 174.21f, 0.0f, false, false, 345.0f, 413.0f)
                curveToRelative(62.57f, -62.58f, 67.43f, -161.35f, 14.57f, -229.54f)
                lineTo(420.0f, 123.11f)
                verticalLineTo(160.0f)
                arcToRelative(22.0f, 22.0f, 0.0f, false, false, 44.0f, 0.0f)
                verticalLineTo(70.0f)
                arcTo(22.0f, 22.0f, 0.0f, false, false, 442.0f, 48.0f)
                close()
                moveTo(313.92f, 381.92f)
                arcToRelative(130.13f, 130.13f, 0.0f, false, true, -183.84f, 0.0f)
                curveToRelative(-50.69f, -50.68f, -50.69f, -133.16f, 0.0f, -183.84f)
                reflectiveCurveToRelative(133.16f, -50.69f, 183.84f, 0.0f)
                reflectiveCurveTo(364.61f, 331.24f, 313.92f, 381.92f)
                close()
            }
        }
        .build()
        return _male!!
    }

private var _male: ImageVector? = null
