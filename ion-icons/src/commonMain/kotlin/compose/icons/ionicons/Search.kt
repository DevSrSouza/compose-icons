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

public val IonIcons.Search: ImageVector
    get() {
        if (_search != null) {
            return _search!!
        }
        _search = Builder(name = "Search", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(456.69f, 421.39f)
                lineTo(362.6f, 327.3f)
                arcToRelative(173.81f, 173.81f, 0.0f, false, false, 34.84f, -104.58f)
                curveTo(397.44f, 126.38f, 319.06f, 48.0f, 222.72f, 48.0f)
                reflectiveCurveTo(48.0f, 126.38f, 48.0f, 222.72f)
                reflectiveCurveToRelative(78.38f, 174.72f, 174.72f, 174.72f)
                arcTo(173.81f, 173.81f, 0.0f, false, false, 327.3f, 362.6f)
                lineToRelative(94.09f, 94.09f)
                arcToRelative(25.0f, 25.0f, 0.0f, false, false, 35.3f, -35.3f)
                close()
                moveTo(97.92f, 222.72f)
                arcToRelative(124.8f, 124.8f, 0.0f, true, true, 124.8f, 124.8f)
                arcTo(124.95f, 124.95f, 0.0f, false, true, 97.92f, 222.72f)
                close()
            }
        }
        .build()
        return _search!!
    }

private var _search: ImageVector? = null
