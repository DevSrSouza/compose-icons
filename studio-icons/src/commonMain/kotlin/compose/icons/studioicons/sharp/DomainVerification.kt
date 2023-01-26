package compose.icons.studioicons.sharp

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
import compose.icons.studioicons.SharpGroup

public val SharpGroup.DomainVerification: ImageVector
    get() {
        if (_domainVerification != null) {
            return _domainVerification!!
        }
        _domainVerification = Builder(name = "DomainVerification", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.6f, 10.88f)
                lineToRelative(-1.42f, -1.42f)
                lineToRelative(-4.24f, 4.25f)
                lineToRelative(-2.12f, -2.13f)
                lineToRelative(-1.42f, 1.42f)
                lineToRelative(3.54f, 3.54f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0f, 4.0f)
                verticalLineToRelative(16.0f)
                horizontalLineToRelative(18.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(3.0f)
                close()
                moveTo(19.0f, 18.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(8.0f)
                horizontalLineToRelative(14.0f)
                verticalLineTo(18.0f)
                close()
            }
        }
        .build()
        return _domainVerification!!
    }

private var _domainVerification: ImageVector? = null
