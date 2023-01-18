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

public val IonIcons.Crop: ImageVector
    get() {
        if (_crop != null) {
            return _crop!!
        }
        _crop = Builder(name = "Crop", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(458.0f, 346.0f)
                horizontalLineTo(192.0f)
                arcToRelative(26.0f, 26.0f, 0.0f, false, true, -26.0f, -26.0f)
                verticalLineTo(54.0f)
                arcToRelative(22.0f, 22.0f, 0.0f, false, false, -44.0f, 0.0f)
                verticalLineToRelative(68.0f)
                horizontalLineTo(54.0f)
                arcToRelative(22.0f, 22.0f, 0.0f, false, false, 0.0f, 44.0f)
                horizontalLineToRelative(68.0f)
                verticalLineTo(320.0f)
                arcToRelative(70.08f, 70.08f, 0.0f, false, false, 70.0f, 70.0f)
                horizontalLineTo(346.0f)
                verticalLineToRelative(68.0f)
                arcToRelative(22.0f, 22.0f, 0.0f, false, false, 44.0f, 0.0f)
                verticalLineTo(390.0f)
                horizontalLineToRelative(68.0f)
                arcToRelative(22.0f, 22.0f, 0.0f, false, false, 0.0f, -44.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(214.0f, 166.0f)
                horizontalLineTo(320.0f)
                arcToRelative(26.0f, 26.0f, 0.0f, false, true, 26.0f, 26.0f)
                verticalLineTo(298.0f)
                arcToRelative(22.0f, 22.0f, 0.0f, false, false, 44.0f, 0.0f)
                verticalLineTo(192.0f)
                arcToRelative(70.08f, 70.08f, 0.0f, false, false, -70.0f, -70.0f)
                horizontalLineTo(214.0f)
                arcToRelative(22.0f, 22.0f, 0.0f, false, false, 0.0f, 44.0f)
                close()
            }
        }
        .build()
        return _crop!!
    }

private var _crop: ImageVector? = null
