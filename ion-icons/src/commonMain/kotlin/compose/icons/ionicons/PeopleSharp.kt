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

public val IonIcons.PeopleSharp: ImageVector
    get() {
        if (_peopleSharp != null) {
            return _peopleSharp!!
        }
        _peopleSharp = Builder(name = "PeopleSharp", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(152.0f, 184.0f)
                moveToRelative(-72.0f, 0.0f)
                arcToRelative(72.0f, 72.0f, 0.0f, true, true, 144.0f, 0.0f)
                arcToRelative(72.0f, 72.0f, 0.0f, true, true, -144.0f, 0.0f)
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(234.0f, 296.0f)
                curveToRelative(-28.16f, -14.3f, -59.24f, -20.0f, -82.0f, -20.0f)
                curveToRelative(-44.58f, 0.0f, -136.0f, 27.34f, -136.0f, 82.0f)
                verticalLineToRelative(42.0f)
                horizontalLineTo(166.0f)
                verticalLineTo(383.93f)
                curveToRelative(0.0f, -19.0f, 8.0f, -38.05f, 22.0f, -53.93f)
                curveTo(199.17f, 317.32f, 214.81f, 305.55f, 234.0f, 296.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(340.0f, 288.0f)
                curveToRelative(-52.07f, 0.0f, -156.0f, 32.16f, -156.0f, 96.0f)
                verticalLineToRelative(48.0f)
                horizontalLineTo(496.0f)
                verticalLineTo(384.0f)
                curveTo(496.0f, 320.16f, 392.07f, 288.0f, 340.0f, 288.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(340.0f, 168.0f)
                moveToRelative(-88.0f, 0.0f)
                arcToRelative(88.0f, 88.0f, 0.0f, true, true, 176.0f, 0.0f)
                arcToRelative(88.0f, 88.0f, 0.0f, true, true, -176.0f, 0.0f)
            }
        }
        .build()
        return _peopleSharp!!
    }

private var _peopleSharp: ImageVector? = null
