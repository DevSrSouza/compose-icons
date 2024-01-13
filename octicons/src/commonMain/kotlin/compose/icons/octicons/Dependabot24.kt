package compose.icons.octicons

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
import compose.icons.Octicons

public val Octicons.Dependabot24: ImageVector
    get() {
        if (_dependabot24 != null) {
            return _dependabot24!!
        }
        _dependabot24 = Builder(name = "Dependabot24", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.75f, 11.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.75f, 0.75f)
                verticalLineToRelative(3.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.5f, 0.0f)
                verticalLineToRelative(-3.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.75f, -0.75f)
                close()
                moveTo(16.0f, 11.75f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -1.5f, 0.0f)
                verticalLineToRelative(3.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 1.5f, 0.0f)
                verticalLineToRelative(-3.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.813f, 1.0f)
                horizontalLineToRelative(2.437f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.75f, 0.75f)
                verticalLineTo(5.0f)
                horizontalLineToRelative(6.75f)
                arcTo(2.25f, 2.25f, 0.0f, false, true, 22.0f, 7.25f)
                verticalLineToRelative(5.25f)
                horizontalLineToRelative(1.25f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, 1.5f)
                horizontalLineTo(22.0f)
                verticalLineToRelative(5.75f)
                arcTo(2.25f, 2.25f, 0.0f, false, true, 19.75f, 22.0f)
                horizontalLineTo(4.25f)
                arcTo(2.25f, 2.25f, 0.0f, false, true, 2.0f, 19.75f)
                verticalLineTo(14.0f)
                horizontalLineTo(0.75f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, -1.5f)
                horizontalLineTo(2.0f)
                verticalLineTo(7.25f)
                arcTo(2.25f, 2.25f, 0.0f, false, true, 4.25f, 5.0f)
                horizontalLineToRelative(7.25f)
                verticalLineTo(2.5f)
                horizontalLineTo(9.813f)
                arcTo(0.75f, 0.75f, 0.0f, false, true, 9.812f, 1.0f)
                close()
                moveTo(3.5f, 7.25f)
                verticalLineToRelative(12.5f)
                curveToRelative(0.0f, 0.414f, 0.336f, 0.75f, 0.75f, 0.75f)
                horizontalLineToRelative(15.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.75f, -0.75f)
                verticalLineTo(7.25f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.75f, -0.75f)
                horizontalLineTo(4.25f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.75f, 0.75f)
                close()
            }
        }
        .build()
        return _dependabot24!!
    }

private var _dependabot24: ImageVector? = null
